package dev.puzzleshq.surface.gdx.rendering.context.impl;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;
import dev.puzzleshq.surface.api.module.AbstractSurfaceModule;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

public class GDXRenderContext implements IRenderContext {

    private Batch batch;
    private Viewport viewport;
    private Camera camera;

    public GDXRenderContext(AbstractSurfaceModule<?> module) {
        this.batch = null;
        this.viewport = null;
        this.camera = null;
    }

    public GDXRenderContext(Batch batch, Viewport viewport, Camera camera) {
        this.batch = batch;
        this.viewport = viewport;
        this.camera = camera;
    }

    public Batch getBatch() {
        return batch;
    }

    public Camera getCamera() {
        return camera;
    }

    public Viewport getViewport() {
        return viewport;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String getName() {
        return "AWTRenderContext";
    }

    @Override
    public ISurfaceModule<?> getParentModule() {
        return null;
    }

}
