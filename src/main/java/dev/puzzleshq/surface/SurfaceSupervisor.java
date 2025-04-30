package dev.puzzleshq.surface;

import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.screens.ISurface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class SurfaceSupervisor {

    private static final AtomicReference<ISurface<?>> superSurface;
    private static final Map<String, ISurfaceModule<?>> moduleMap;

    private static final Map<String, ISurface<?>> surfaceMap;

    static {
        surfaceMap = new ConcurrentHashMap<>();
        superSurface = new AtomicReference<>(null);
        moduleMap = new ConcurrentHashMap<>();
    }

    public static void register(String id, ISurface<?> surface) {
        SurfaceSupervisor.surfaceMap.put(id, surface);
    }

    public static ISurface<?> getSurface(String id) {
        return SurfaceSupervisor.surfaceMap.get(id);
    }

    public static <C extends IRenderContext> void register(String name, ISurfaceModule<C> module) {
        SurfaceSupervisor.moduleMap.put(name, module);
    }

    public static <C extends IRenderContext> ISurfaceModule<C> getModule(String name) {
        return (ISurfaceModule<C>) SurfaceSupervisor.moduleMap.get(name);
    }

    public static Map<String, ISurfaceModule<?>> getModuleMap() {
        return moduleMap;
    }

    public static ISurface<?> getSuperSurface() {
        return SurfaceSupervisor.superSurface.get();
    }

    public static void setSuperSurface(String id) {
        ISurface<?> surface = SurfaceSupervisor.getSurface(id);

        ISurface<?> oldSurface = SurfaceSupervisor.getSuperSurface();
        oldSurface.preSwitchSurface(oldSurface, surface);
        surface.preSwitchedTo(surface, oldSurface);
        SurfaceSupervisor.superSurface.set(surface);
        surface.postSwitchedTo(surface, oldSurface);
        oldSurface.postSwitchSurface(oldSurface, surface);
    }

}
