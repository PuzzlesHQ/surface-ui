package dev.puzzleshq.surface.cereal;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.element.impl.*;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.element.styles.TabbedSliderBarStyle;
import dev.puzzleshq.surface.api.element.styles.ToggleButtonStyle;
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
        CerealSupervisor.register("cereal:tabbed-slider-bar", (o) -> {
            JsonValue styleValue = o.get("style");
            JsonObject object = null;
            if (styleValue != null && styleValue.isObject()) object = styleValue.asObject();
            if (styleValue != null && styleValue.isString()) object = CerealSupervisor.getJsonDataFromLocation(styleValue.asString());
            TabbedSliderBarStyle style = TabbedSliderBarStyle.DEFAULT;
            if (object != null) {
                Color full = CerealSupervisor.getColorOrDefault(object, "full-color", ProgressBarStyle.DEFAULT.full);
                Color empty = CerealSupervisor.getColorOrDefault(object, "empty-color", ProgressBarStyle.DEFAULT.empty);
                Color outline = CerealSupervisor.getColorOrDefault(object, "outline-color", ProgressBarStyle.DEFAULT.outline);

                Color hoverFull = CerealSupervisor.getColorOrDefault(object, "full-hover-color", ProgressBarStyle.DEFAULT.full);
                Color hoverEmpty = CerealSupervisor.getColorOrDefault(object, "empty-hover-color", ProgressBarStyle.DEFAULT.empty);
                Color hoverOutline = CerealSupervisor.getColorOrDefault(object, "outline-hover-color", ProgressBarStyle.DEFAULT.outline);

                Color tabOutline = CerealSupervisor.getColorOrDefault(object, "tab-outline-color", ProgressBarStyle.DEFAULT.full);
                Color tabBackground = CerealSupervisor.getColorOrDefault(object, "tab-background-hover-color", ProgressBarStyle.DEFAULT.empty);
                Color hoverTabOutline = CerealSupervisor.getColorOrDefault(object, "tab-outline-hover-color", ProgressBarStyle.DEFAULT.outline);
                Color hoverTabBackground = CerealSupervisor.getColorOrDefault(object, "tab-background-hover-color", ProgressBarStyle.DEFAULT.outline);

                float tab_outline_thickness = object.getFloat("tab-outline-thickness", ProgressBarStyle.DEFAULT.outlineThickness);
                float slider_outline_thickness = object.getFloat("slider-outline-thickness", ProgressBarStyle.DEFAULT.outlineThickness);

                style = new TabbedSliderBarStyle(
                        full, empty,
                        outline, tabOutline,
                        tabBackground, hoverFull,
                        hoverEmpty, hoverOutline,
                        hoverTabOutline, hoverTabBackground,
                        tab_outline_thickness, slider_outline_thickness
                );
            }
            return new TabbedSliderBar(style);
        });

        CerealSupervisor.register("cereal:image", (o) -> {
            ImageElement element = new ImageElement();
            element.setMinScale(o.getFloat("min-scale", .8f));
            element.setMaxScale(o.getFloat("max-scale", 1.1f));
            element.setRotation(o.getInt("rotation", 0));
            element.setFrequency(o.getFloat("frequency", -1));
            element.setOrigin(CerealSupervisor.getEnumConstantOrDefault(o, "origin", ImageElement.Origin.CENTER, ImageElement.Origin.class));
            element.setTint(CerealSupervisor.getColorOrDefault(o, "tint", Color.WHITE));
            element.setTexture(ResourceLocation.of(o.getString("image", "cereal:textures/missing-no.png")));
            return element;
        });

        CerealSupervisor.register("cereal:progress-bar", (o) -> {
            JsonValue styleValue = o.get("style");
            JsonObject object = null;
            if (styleValue != null && styleValue.isObject()) object = styleValue.asObject();
            if (styleValue != null && styleValue.isString()) object = CerealSupervisor.getJsonDataFromLocation(styleValue.asString());
            ProgressBarStyle style = ProgressBarStyle.DEFAULT;
            if (object != null) {
                Color foregroundFull = CerealSupervisor.getColorOrDefault(object, "full-color", ProgressBarStyle.DEFAULT.full);
                Color foregroundEmpty = CerealSupervisor.getColorOrDefault(object, "empty-color", ProgressBarStyle.DEFAULT.empty);
                Color background = CerealSupervisor.getColorOrDefault(object, "outline-color", ProgressBarStyle.DEFAULT.outline);

                float outline_thickness = object.getFloat("outline-thickness", ProgressBarStyle.DEFAULT.outlineThickness);

                style = new ProgressBarStyle(
                        foregroundFull,
                        foregroundEmpty,
                        background,
                        outline_thickness
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
                Color background = CerealSupervisor.getColorOrDefault(object, "background-color", ButtonStyle.DEFAULT.getDefaultBackground());
                Color outline = CerealSupervisor.getColorOrDefault(object, "outline-color", ButtonStyle.DEFAULT.getDefaultOutline());

                Color background_hover = CerealSupervisor.getColorOrDefault(object, "background-hover-color", ButtonStyle.DEFAULT.getHoverBackground());
                Color outline_hover = CerealSupervisor.getColorOrDefault(object, "outline-hover-color", ButtonStyle.DEFAULT.getHoverOutline());

                Color background_press = CerealSupervisor.getColorOrDefault(object, "background-press-color", ButtonStyle.DEFAULT.getPressBackground());
                Color outline_press = CerealSupervisor.getColorOrDefault(object, "outline-press-color", ButtonStyle.DEFAULT.getPressOutline());

                float outline_thickness = object.getFloat("outline-thickness", ButtonStyle.DEFAULT.getOutlineThickness());

                style = new ButtonStyle(
                        background, outline,
                        background_hover, outline_hover,
                        background_press, outline_press,
                        outline_thickness
                );
            }
            return new ButtonElement(style);
        });

        CerealSupervisor.register("cereal:toggle-button", (o) -> {
            JsonValue styleValue = o.get("style");
            JsonObject object = null;
            if (styleValue != null && styleValue.isObject()) object = styleValue.asObject();
            if (styleValue != null && styleValue.isString()) object = CerealSupervisor.getJsonDataFromLocation(styleValue.asString());
            ToggleButtonStyle style = ToggleButtonStyle.DEFAULT;
            if (object != null) {
                Color backgroundHoverToggledOn = CerealSupervisor.getColorOrDefault(object, "toggled-on-background-hover-color", ToggleButtonStyle.DEFAULT.onHoverBackgroundToggedOn);
                Color outlineHoverToggledOn = CerealSupervisor.getColorOrDefault(object, "toggled-on-outline-hover-color", ToggleButtonStyle.DEFAULT.onHoverOutlineToggedOn);

                Color backgroundHoverToggledOff = CerealSupervisor.getColorOrDefault(object, "toggled-off-background-hover-color", ToggleButtonStyle.DEFAULT.onHoverBackgroundToggedOff);
                Color outlineHoverToggledOff = CerealSupervisor.getColorOrDefault(object, "toggled-off-outline-hover-color", ToggleButtonStyle.DEFAULT.onHoverOutlineToggedOff);

                Color backgroundToggedOn = CerealSupervisor.getColorOrDefault(object, "toggled-on-background-color", ToggleButtonStyle.DEFAULT.onToggleOnBackground);
                Color outlineToggedOn = CerealSupervisor.getColorOrDefault(object, "toggled-on-outline-color", ToggleButtonStyle.DEFAULT.onToggleOnOutline);

                Color backgroundToggedOff = CerealSupervisor.getColorOrDefault(object, "toggled-off-background-color", ToggleButtonStyle.DEFAULT.onToggleOffBackground);
                Color outlineToggedOff = CerealSupervisor.getColorOrDefault(object, "toggled-off-outline-color", ToggleButtonStyle.DEFAULT.onToggleOffOutline);

                float outline_thickness = object.getFloat("outline-thickness", ToggleButtonStyle.DEFAULT.outlineThickness);

                style = new ToggleButtonStyle(
                        backgroundHoverToggledOn,
                        outlineHoverToggledOn,
                        backgroundHoverToggledOff,
                        outlineHoverToggledOff,
                        backgroundToggedOn,
                        outlineToggedOn,
                        backgroundToggedOff,
                        outlineToggedOff,
                        outline_thickness
                );
            }
            return new ToggleButtonElement(style);
        });
    }

    private static <T extends Enum<T>> T getEnumConstantOrDefault(JsonObject o, String name, T defaultValue, Class<T> enumClass) {
        JsonValue value = o.get(name);
        if (value == null) return defaultValue;

        if (value.isNumber()) {
            try {
                return enumClass.getEnumConstants()[value.asInt()];
            } catch (Exception ignore) {
                throw new IllegalArgumentException("JsonValue \"" + value + "\" at Name: \"" + name + "\" must be valid ordinal to enum constant.");
            }
        }
        if (value.isString()) {
            try {
                return Enum.valueOf(enumClass, value.asString());
            } catch (Exception ignore) {
                throw new IllegalArgumentException("JsonValue \"" + value + "\" at Name: \"" + name + "\" must be a valid enum constant.");
            }
        }

        return defaultValue;
    }

    public static Color getColor(JsonObject object, String s) {
        JsonValue value = object.get(s);
        if (value == null) return null;
        if (value.isArray()) {
            JsonArray array = value.asArray();
            return new Color(array.get(0).asInt(), array.get(1).asInt(), array.get(2).asInt());
        }
        if (value.isString()) {
            if (value.asString().startsWith("#"))
                return Color.decode(value.asString().toUpperCase());
            return Colors.getColor(value.asString());
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
