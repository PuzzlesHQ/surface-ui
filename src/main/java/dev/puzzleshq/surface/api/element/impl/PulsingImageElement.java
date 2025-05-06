package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.ResourceLocation;

import java.awt.*;

public class PulsingImageElement extends AbstractElement {

    float minScale;
    float maxScale;

    protected ResourceLocation location;

    protected float scale = 0;
    protected float rotation = 0;
    protected Color tint = Color.WHITE;
    protected float frequency = 1;

    public PulsingImageElement() {
    }

    public void setTexture(ResourceLocation location) {
        this.location = location;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public void setTint(Color tint) {
        this.tint = tint;
    }

    @Override
    public float getTotalHeight() {
        return this.height * scale;
    }

    @Override
    public float getTotalWidth() {
        return this.width * scale;
    }

    public ResourceLocation getImageLocation() {
        return location;
    }

    float optimal = 1.1f;
    boolean increasing = true;
    double phase = 0;

    @Override
    public void update(ISurface surface, float delta) {
        phase += 2 * Math.PI * frequency * delta;

        // Wrap phase to prevent it from growing indefinitely
        if (phase > 2 * Math.PI) {
            phase -= 2 * Math.PI;
        }

        double amplitude = (maxScale - minScale) / 2; // (1.3 - 0.8) / 2
        double midpoint = (maxScale + minScale) / 2;  // (1.3 + 0.8) / 2

        scale = (float) (midpoint + amplitude * Math.sin(phase));

    }

    public void setMaxScale(float maxScale) {
        this.maxScale = maxScale;
    }

    public void setMinScale(float minScale) {
        this.minScale = minScale;
    }

    public float getMaxScale() {
        return maxScale;
    }

    public float getMinScale() {
        return minScale;
    }

    public float getVisualScale() {
        return scale;
    }

    public float getRotation() {
        return rotation;
    }

    public Color getTint() {
        return tint;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }
}
