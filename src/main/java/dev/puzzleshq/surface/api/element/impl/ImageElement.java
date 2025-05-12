package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.ResourceLocation;

import java.awt.*;

public class ImageElement extends AbstractElement {

    protected ResourceLocation location;
    protected Origin origin;

    protected float scale = 1;
    protected float rotation = 0;
    protected Color tint = Color.WHITE;
    protected float frequency = 1;

    protected float minScale = 0.8f;
    protected float maxScale = 1.1f;

    public static final ResourceLocation MISSING_TEXTURE = ResourceLocation.of("cereal:textures/missing-no.png");

    public ImageElement() {
        setTexture(MISSING_TEXTURE);
        setOrigin(Origin.CENTER);
    }

    public ImageElement(ResourceLocation location) {
        setTexture(location);
    }

    public ImageElement(ResourceLocation location, Origin origin) {
        setTexture(location);
        setOrigin(origin);
    }

    public void setTexture(ResourceLocation location) {
        this.location = location;
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
        if (frequency <= 0) return;

        phase += 2 * Math.PI * frequency * delta;

        // Wrap phase to prevent it from growing indefinitely
        if (phase > 2 * Math.PI) {
            phase -= 2 * Math.PI;
        }

        double amplitude = (maxScale - minScale) / 2; // (1.3 - 0.8) / 2
        double midpoint = (maxScale + minScale) / 2;  // (1.3 + 0.8) / 2

        scale = (float) (midpoint + amplitude * Math.sin(phase));
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

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        if (origin == null) throw new IllegalArgumentException("ImageStyle: \"origin\" cannot be 'null'");
        this.origin = origin;
    }

    public void setMinScale(float minScale) {
        if (minScale < 0) throw new IllegalArgumentException("ImageStyle: \"minScale\" cannot be less than zero.");
        this.minScale = minScale;
        this.scale = minScale;
    }

    public void setMaxScale(float maxScale) {
        if (maxScale < 0) throw new IllegalArgumentException("ImageStyle: \"maxScale\" cannot be less than zero.");
        this.maxScale = maxScale;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public void setTint(Color tint) {
        if (tint == null) throw new IllegalArgumentException("ImageStyle: \"tint\" cannot be 'null'");
        this.tint = tint;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public enum Origin {
        TOP_RIGHT,
        TOP_LEFT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        CENTER
    }
}
