package dev.puzzleshq.surface.cereal;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ImageElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.impl.PulsingImageElement;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.util.Colors;
import dev.puzzleshq.surface.cereal.js.hidden.ClassFinder;
import dev.puzzleshq.surface.util.RawAssetLoader;
import dev.puzzleshq.surface.util.ResourceLocation;
import org.hjson.JsonArray;
import org.hjson.JsonObject;
import org.hjson.JsonValue;
import org.mozilla.javascript.Context;

import java.awt.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class CerealSupervisor {

    private static final Map<String, Function<JsonObject, ? extends IElement>> elementSupplierMap;
    private static final Map<String, JsonObject> styleObjectMap;

    public static Context createContext() {
        Context ctx = Context.enter();
        ctx.setClassShutter(new ClassFinder());
        return ctx;
    }

    static {
        elementSupplierMap = new ConcurrentHashMap<>();
        styleObjectMap = new ConcurrentHashMap<>();
        CerealSupervisor.init();
    }

    private static void init() {
        CerealSupervisor.register("cereal:pulsing-image", (o) -> {
            PulsingImageElement element = new PulsingImageElement();
            element.setTexture(ResourceLocation.of(o.getString("image", "cereal:textures/missing-no.png")));
            element.setTint(CerealSupervisor.getColorOrDefault(o, "tint", Color.WHITE));
            element.setRotation(o.getInt("rotation", 0));
            element.setMaxScale(o.getFloat("max-scale", 1.1f));
            element.setMinScale(o.getFloat("min-scale", .8f));
            element.setFrequency(o.getFloat("frequency", 1));
            return element;
        });

        CerealSupervisor.register("cereal:image", (o) -> {
            ImageElement element = new ImageElement();
            element.setTexture(ResourceLocation.of(o.getString("image", "cereal:textures/missing-no.png")));
            element.setTint(CerealSupervisor.getColorOrDefault(o, "tint", Color.WHITE));
            element.setRotation(o.getInt("rotation", 0));
            element.setScale(o.getFloat("scale", 1));
            return element;
        });

        CerealSupervisor.register("cereal:progress-bar", (o) -> {
            JsonValue styleValue = o.get("style");
            JsonObject object = null;
            if (styleValue != null && styleValue.isObject()) object = styleValue.asObject();
            if (styleValue != null && styleValue.isString()) object = CerealSupervisor.getJsonDataFromLocation(styleValue.asString());
            ProgressBarStyle style = ProgressBarStyle.DEFAULT;
            if (object != null) {
                Color foregroundFull = CerealSupervisor.getColorOrDefault(object, "foreground-full", ProgressBarStyle.DEFAULT.getForegroundFull());
                Color foregroundEmpty = CerealSupervisor.getColorOrDefault(object, "foreground-empty", ProgressBarStyle.DEFAULT.getForegroundEmpty());
                Color background = CerealSupervisor.getColorOrDefault(object, "background", ProgressBarStyle.DEFAULT.getBackground());

                style = new ProgressBarStyle(
                        foregroundFull,
                        foregroundEmpty,
                        background
                );
            }
            return new ProgressBarElement(style);
        });

        CerealSupervisor.register("cereal:button", (o) -> {
            JsonValue styleValue = o.get("style");
            JsonObject object = null;
            if (styleValue != null && styleValue.isObject()) object = styleValue.asObject();
            if (styleValue != null && styleValue.isString()) object = CerealSupervisor.getJsonDataFromLocation(styleValue.asString());
            ButtonStyle style = ButtonStyle.DEFAULT;
            if (object != null) {
                Color background = CerealSupervisor.getColorOrDefault(object, "background", ButtonStyle.DEFAULT.getDefaultBackground());
                Color outline = CerealSupervisor.getColorOrDefault(object, "outline", ButtonStyle.DEFAULT.getDefaultOutline());

                Color background_hover = CerealSupervisor.getColorOrDefault(object, "background-hover", background);
                Color outline_hover = CerealSupervisor.getColorOrDefault(object, "outline-hover", outline);

                Color background_press = CerealSupervisor.getColorOrDefault(object, "background-press", background);
                Color outline_press = CerealSupervisor.getColorOrDefault(object, "outline-press", outline);

                int outline_thickness = object.getInt("outline-thickness", ButtonStyle.DEFAULT.getOutlineThickness());

                style = new ButtonStyle(
                        background, outline,
                        background_hover, outline_hover,
                        background_press, outline_press,
                        outline_thickness
                );
            }
            return new ButtonElement(style);
        });
    }

    public static Color getColor(JsonObject object, String s) {
        JsonValue value = object.get(s);
        if (value == null) return null;
        if (value.isArray()) {
            JsonArray array = value.asArray();
            return new Color(array.get(0).asInt(), array.get(1).asInt(), array.get(2).asInt());
        }
        if (value.isString()) {
            Color color = Colors.getColor(value.asString());
            if (color != null) return color;
            return Color.decode(value.asString().toUpperCase());
        }
        return null;
    }

    public static Color getColorOrDefault(JsonObject object, String s, Color defaultColor) {
        Color foundColor = getColor(object, s);
        return foundColor == null ? defaultColor : foundColor;
    }

    private static JsonObject getJsonDataFromLocation(String string) {
        RawAssetLoader.RawFileHandle handle = RawAssetLoader.getClassPathAsset(ResourceLocation.of(string));
        if (handle == null)
            return getStyle(string);
        return JsonObject.readHjson(handle.getString()).asObject().get("meta").asObject();
    }

    public static void register(String id, Function<JsonObject, ? extends IElement> elementSupplier) {
        CerealSupervisor.elementSupplierMap.put(id, elementSupplier);
    }

    public static void registerStyle(String id, JsonObject object) {
        CerealSupervisor.styleObjectMap.put(id, object);
    }

    public static JsonObject getStyle(String id) {
        return CerealSupervisor.styleObjectMap.get(id);
    }

    public static Function<JsonObject, ? extends IElement> getElementSupplier(String id) {
        return CerealSupervisor.elementSupplierMap.get(id);
    }

    public static IElement getElement(String id, JsonObject meta) {
        return CerealSupervisor.elementSupplierMap.get(id).apply(meta);
    }

}
