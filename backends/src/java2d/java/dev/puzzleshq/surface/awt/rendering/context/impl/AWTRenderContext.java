package dev.puzzleshq.surface.awt.rendering.context.impl;

import dev.puzzleshq.surface.api.rendering.context.AbstractRenderContext;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.rendering.context.ScreenBounds;
import dev.puzzleshq.surface.awt.SurfaceUISwing;

import java.awt.*;

public class AWTRenderContext extends AbstractRenderContext {

    public Graphics graphics;
    private float vpWidth;
    private float vpHeight;
    public ScreenBounds bounds;
    public AWTQuadrentSpace space;

    public AWTRenderContext(Graphics graphics, float vpWidth, float vpHeight) {
        super(SurfaceUISwing.INSTANCE, AbstractRenderContext.class.getSimpleName());
        this.graphics = graphics;
        this.vpWidth = vpWidth;
        this.vpHeight = vpHeight;

        this.bounds = new ScreenBounds(0, 0, (int) vpWidth, (int) vpHeight);
        this.space = new AWTQuadrentSpace(this.bounds);
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public ScreenBounds getBounds() {
        return bounds;
    }

    public AWTQuadrentSpace getSpace() {
        return space;
    }

    @Override
    public String getName() {
        return "AWTRenderContext";
    }

    public void setBounds(int x, int y, int width, int height) {
        this.bounds.set(x, y, width ,height);
        this.space.setBounds(this.bounds);
    }
}
