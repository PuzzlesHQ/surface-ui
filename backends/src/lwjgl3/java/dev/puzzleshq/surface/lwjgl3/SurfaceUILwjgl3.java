package dev.puzzleshq.surface.lwjgl3;

import dev.puzzleshq.surface.api.module.AbstractSurfaceModule;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.lwjgl3.rendering.LwjglRenderContext;

public class SurfaceUILwjgl3 extends AbstractSurfaceModule<LwjglRenderContext> {

    public static final ISurfaceModule<LwjglRenderContext> INSTANCE = new SurfaceUILwjgl3();

    public SurfaceUILwjgl3(String name) {
        super(name);
    }
}
