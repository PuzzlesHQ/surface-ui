package dev.puzzleshq.surface;

import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SurfaceUI {

    private static final Map<String, ISurfaceModule<?>> moduleMap;

    static {
        moduleMap = new ConcurrentHashMap<>();
    }

    public static <C extends IRenderContext> void register(String name, ISurfaceModule<C> module) {
        SurfaceUI.moduleMap.put(name, module);
    }

    public static <C extends IRenderContext> ISurfaceModule<C> getModule(String name) {
        return (ISurfaceModule<C>) SurfaceUI.moduleMap.get(name);
    }

    public static Map<String, ISurfaceModule<?>> getModuleMap() {
        return moduleMap;
    }

}
