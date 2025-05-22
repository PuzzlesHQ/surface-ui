package dev.puzzleshq.surface;

import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.SurfacePoint;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

public class SurfaceSupervisor {

    private static final AtomicReference<ISurface> superSurface;
    private static final Map<String, ISurfaceModule<?>> moduleMap;

    private static final Map<String, ISurface<?>> surfaceMap;

    public static final SurfacePoint MOUSE_POSITION = new SurfacePoint();
    public static Function<SurfacePoint, SurfacePoint> POINT_UNPROJECTION_FUNCTION = null;

    public static SurfacePoint unprojectPoint(SurfacePoint point) {
        if (SurfaceSupervisor.POINT_UNPROJECTION_FUNCTION == null) return point;
        return SurfaceSupervisor.POINT_UNPROJECTION_FUNCTION.apply(point);
    }

    static {
        SurfaceUpdateSupervisor.start();

        surfaceMap = new ConcurrentHashMap<>();
        superSurface = new AtomicReference<>(null);
        moduleMap = new ConcurrentHashMap<>();
    }

    public static void register(String id, ISurface<?> surface) {
        surface.setId(id);
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

    public static void renderCurrentSurface(IRenderContext context) {
        ISurface surface = getCurrentSurface();
        surface.setContext(context);

        if (!surface.isInitialized()) surface.init();
        try {
            surface.render();
        } catch (Exception e) {
            System.err.println("Error occurred while rendering surface \"" + surface.getId() + "\"");
            e.printStackTrace();
            Runtime.getRuntime().exit(-1);
        }
    }

    public static ISurface getCurrentSurface() {
        return SurfaceSupervisor.superSurface.get();
    }

    public static void setSurface(String id) {
        ISurface surface = SurfaceSupervisor.getSurface(id);

        ISurface oldSurface = SurfaceSupervisor.getCurrentSurface();
        if (oldSurface != null) oldSurface.preSwitchSurface(oldSurface, surface);
        surface.preSwitchedTo(surface, oldSurface);
        SurfaceSupervisor.superSurface.set(surface);
        surface.postSwitchedTo(surface, oldSurface);
        if (oldSurface != null) oldSurface.postSwitchSurface(oldSurface, surface);
    }

}
