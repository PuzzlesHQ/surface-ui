package dev.puzzleshq.surface.api.element.impl;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.AnchorX;
import dev.puzzleshq.surface.api.rendering.AnchorY;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;

@NeedsDocumentation
public abstract class AbstractElement implements IElement {

    protected boolean visibility;
    protected int x, y;
    protected int width, height;

    protected AnchorX anchorX;
    protected AnchorY anchorY;

    public AbstractElement() {
        this.anchorX = AnchorX.NONE;
        this.anchorY = AnchorY.NONE;
    }

    protected int zIndex = 0;

    @Override
    public int getZIndex() {
        return zIndex;
    }

    @Override
    public void setZIndex(int index) {
        this.zIndex = index;
    }

    @Override
    public void update(ISurface surface, float delta) {}

    @Override
    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    @Override
    public boolean isVisible() {
        return visibility;
    }

    @Override
    public void setPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(final int x) {
        this.x = x;
    }

    @Override
    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public float getTotalWidth() {
        return width;
    }

    public float getTotalHeight() {
        return height;
    }

    @Override
    public void setAnchors(final AnchorX xAnchor, final AnchorY yAnchor) {
        this.anchorX = xAnchor;
        this.anchorY = yAnchor;
    }

    @Override
    public void setAnchorX(final AnchorX xAnchor) {
        this.anchorX = xAnchor;
    }

    @Override
    public void setAnchorY(final AnchorY yAnchor) {
        this.anchorY = yAnchor;
    }

    @Override
    public AnchorX getAnchorX() {
        return anchorX;
    }

    @Override
    public AnchorY getAnchorY() {
        return anchorY;
    }

    public IElementRenderer<?, ? extends IElement> getRenderer(ISurfaceModule<?> module) {
        return module.getElementRenderer(this.getClass());
    }

    public static float getRealX(final float screenWidth, final AbstractElement element) {
        return switch (element.anchorX) {
            case NONE -> element.x;
            case RIGHT -> element.x + (screenWidth * .5f) - (element.getTotalWidth());
            case LEFT -> element.x - (screenWidth * .5f);
            case CENTER -> element.x - (element.getTotalWidth() * .5f);
        };
    }

    public static float getRealY(final float screenHeight, AbstractElement element) {
        return switch (element.anchorY) {
            case NONE -> element.y;
            case TOP -> element.y - (screenHeight * .5f);
            case BOTTOM -> element.y + (screenHeight * .5f) - (element.getTotalHeight());
            case CENTER -> element.y - (element.getTotalHeight() * .5f);
        };
    }

}
