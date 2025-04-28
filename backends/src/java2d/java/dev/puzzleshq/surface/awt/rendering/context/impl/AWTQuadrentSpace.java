package dev.puzzleshq.surface.awt.rendering.context.impl;

import dev.puzzleshq.surface.api.rendering.context.ScreenBounds;

import java.awt.*;

public class AWTQuadrentSpace {

    ScreenBounds bounds;

    public AWTQuadrentSpace(ScreenBounds bounds) {
        this.bounds = bounds;
    }

    public float transformX(float x) {
        return bounds.getWidth() / 2f + x;
    }

    public float transformY(float y) {
        return bounds.getHeight() / 2f + y;
    }

    public Point transform(int x, int y) {
        return new Point(
                bounds.getWidth() / 2 + x,
                bounds.getHeight() / 2 + y
        );
    }

    public ScreenBounds getBounds() {
        return bounds;
    }

    public void setBounds(ScreenBounds bounds) {
        this.bounds = bounds;
    }

}
