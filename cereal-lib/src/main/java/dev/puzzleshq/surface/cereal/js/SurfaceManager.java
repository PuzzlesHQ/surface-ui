package dev.puzzleshq.surface.cereal.js;

import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.screens.ISurface;

@JsIncluded
public class SurfaceManager {

    public static final SurfaceManager INSTANCE = new SurfaceManager();

    public SurfaceManager() {}

    public ISurface getCurrentSurface() {
        return SurfaceSupervisor.getCurrentSurface();
    }

    public void swapSurface(String id) {
        SurfaceSupervisor.setSurface(id);
    }

}
