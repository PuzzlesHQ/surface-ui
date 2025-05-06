package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.util.ResourceLocation;

import java.awt.*;

public class ImageElement extends AbstractElement {

    protected ResourceLocation location;

    protected float scale = 1;
    protected float rotation = 0;
    protected Color tint = Color.WHITE;

    public ImageElement() {
    }

    public void setTexture(ResourceLocation location) {
        this.location = location;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public void setTint(Color tint) {
        this.tint = tint;
    }

    @Override
    public float getTotalHeight() {
        return this.height * this.scale;
    }

    @Override
    public float getTotalWidth() {
        return this.width * this.scale;
    }

    public ResourceLocation getImageLocation() {
        return location;
    }

    public float getScale() {
        return scale;
    }

    public float getRotation() {
        return rotation;
    }

    public Color getTint() {
        return tint;
    }
}
