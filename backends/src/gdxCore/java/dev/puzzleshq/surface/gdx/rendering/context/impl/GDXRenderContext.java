package dev.puzzleshq.surface.gdx.rendering.context.impl;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;
import dev.puzzleshq.surface.api.module.AbstractSurfaceModule;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.context.AbstractRenderContext;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;

import java.awt.*;

public class GDXRenderContext extends AbstractRenderContext {

    private Batch batch;
    private Viewport viewport;
    private Camera camera;

    public GDXRenderContext(Batch batch, Viewport viewport, Camera camera) {
        super(SurfaceUIGdx.INSTANCE, "gdxContext");
        this.batch = batch;
        this.viewport = viewport;
        this.camera = camera;
        if (viewport == null) return;

        this.setVpSize(viewport.getWorldWidth(), viewport.getWorldHeight());
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
        this.setVpSize(viewport.getWorldWidth(), viewport.getWorldHeight());
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
        return SurfaceUIGdx.INSTANCE;
    }

    @Override
    public void clearScreenWithColor(Color backgroundColor) {
        ScreenUtils.clear(backgroundColor.getRed() / 255f, backgroundColor.getGreen() / 255f, backgroundColor.getBlue() / 255f, backgroundColor.getAlpha() / 255f);
    }

    public void updateVp() {
        this.setVpSize(viewport.getWorldWidth(), viewport.getWorldHeight());
    }
}
