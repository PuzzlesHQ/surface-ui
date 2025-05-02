package dev.puzzleshq.surface.cereal.io;

import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.AnchorX;
import dev.puzzleshq.surface.api.rendering.AnchorY;
import dev.puzzleshq.surface.cereal.CerealSupervisor;
import dev.puzzleshq.util.RawAssetLoader;
import dev.puzzleshq.util.ResourceLocation;
import org.hjson.JsonArray;
import org.hjson.JsonObject;
import org.hjson.JsonValue;

public class SurfaceDeserializer {

    public static ScriptedSurface deserialize(String json) {
        ScriptedSurface surface = new ScriptedSurface();
        JsonObject object = JsonObject.readHjson(json).asObject();

        JsonValue scriptPath = object.get("script-path");
        if (scriptPath != null) {
            ResourceLocation script = ResourceLocation.of(scriptPath.asString());
            RawAssetLoader.RawFileHandle handle = RawAssetLoader.getClassPathAsset(script);
            surface.setScript(handle.getFile(), handle.getString());
        }

        JsonValue surfaceMeta = object.get("meta");
        if (surfaceMeta != null && surfaceMeta.isObject()) SurfaceDeserializer.processMeta(surface, surfaceMeta.asObject());

        JsonValue elements = object.get("elements");
        if (elements != null) {
            JsonArray elementsArray = elements.asArray();
            for (JsonValue value : elementsArray) {
                if (value.isObject()) {
                    JsonObject value1 = value.asObject();
                    String type = value1.get("type").asString();
                    JsonValue meta = value1.get("meta");
                    if (meta == null) meta = new JsonObject();
                    IElement element = CerealSupervisor.getElement(type, meta.asObject());
                    surface.addElement(value1.get("id").asString(), element);

                    parseElement(element, value1);
                }
            }
        }

        surface.init();

        SurfaceSupervisor.register(object.get("id").asString(), surface);
        return surface;
    }

    private static JsonObject getJsonDataFromLocation(String string) {
        RawAssetLoader.RawFileHandle handle = RawAssetLoader.getClassPathAsset(ResourceLocation.of(string));
        if (handle == null) return null;
        return JsonObject.readHjson(handle.getString()).asObject();
    }

    private static void processMeta(ScriptedSurface surface, JsonObject meta) {
        JsonValue styles = meta.get("styles");
        JsonArray array;
        if (styles != null && styles.isArray()) {
            array = styles.asArray();
            for (JsonValue value : array) {
                if (value.isString()) {
                    JsonObject object = SurfaceDeserializer.getJsonDataFromLocation(value.asString());
                    if (object != null) CerealSupervisor.registerStyle(object.get("id").asString(), object.get("meta").asObject());
                }
            }
        }
        surface.backgroundColor = CerealSupervisor.getColor(meta, "background-color");
    }

    private static void parseElement(IElement element, JsonObject obj) {
        JsonArray array;

        JsonValue anchorsValue = obj.get("anchors");
        if (anchorsValue != null) {
            array = anchorsValue.asArray();

            element.setAnchors(AnchorX.valueOf(array.get(0).asString().toUpperCase()), AnchorY.valueOf(array.get(1).asString().toUpperCase()));
        }
        JsonValue posValue = obj.get("pos");
        if (posValue != null) {
            array = posValue.asArray();

            element.setPosition(array.get(0).asInt(), array.get(1).asInt());
        }
        JsonValue sizeValue = obj.get("size");
        if (sizeValue != null) {
            array = sizeValue.asArray();

            element.setSize(array.get(0).asInt(), array.get(1).asInt());
        }
    }

}
