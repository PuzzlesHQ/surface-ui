package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.element.styles.TabbedSliderBarStyle;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.SurfacePoint;

public class TabbedSliderBar extends AbstractInteractableElement {

    private TabbedSliderBarStyle style;

    public TabbedSliderBar() {
        this(TabbedSliderBarStyle.DEFAULT);
    }

    public TabbedSliderBar(TabbedSliderBarStyle style) {
        this.style = style;

        this.width = 1000;
        this.height = 30;

        this.progress = 50;

        this.tabWidth = 15;
        this.tabHeight = this.height + 30;

        this.calculateStep();
    }

    public void setStyle(TabbedSliderBarStyle style) {
        this.style = style;
    }

    public TabbedSliderBarStyle getStyle() {
        return style;
    }

    protected int tabWidth;
    protected int tabHeight;

    protected float progress = 0;

    protected int max = 100;
    protected float step;
    protected float proStep;

    private void calculateStep() {
        this.step = (100f / (this.max * ((float) this.max / this.width)) * /* scale */ (this.max / 100f));
        this.proStep = (float) this.max / this.width;
    }

    public void setProgress(final float progress) {
        if (progress > max)
            this.progress = max;
        else
            this.progress = progress;
    }

    public void setMax(final int max) {
        this.max = max;
        this.calculateStep();
    }

    SurfacePoint point = new SurfacePoint();

    float hasChanged;
    @Override
    public void update(ISurface surface, float delta) {
        this.isHovering(surface);
        this.isHoverTab(surface);
//        if (isBeingPressed && !isBeingHoveredOver) {
//            isBeingPressed = false;
//        }

        if (isBeingPressed) {
            point = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);
            point.x += - tabWidth / 2f + style.tabOutlineSize;

            float posX = getRealX(surface.getContext().getVPSize().x, this);
            float difference = width - ((width + posX) - point.x);
            progress = (proStep * difference);
            progress = Math.max(Math.min(progress, this.max), 0);
            if (hasChanged != point.x) {
                System.out.println(progress);

                hasChanged = point.x;
            }
        }

    }

    boolean isTabBeingHovered;

    protected boolean isHoverTab(ISurface surface) {
        SurfacePoint vpSize = surface.getContext().getVPSize();

        float vx = AbstractElement.getRealX(vpSize.x, this) + getRelativeTabX();
        float vy = AbstractElement.getRealY(vpSize.y, this) + getRelativeTabY();

        SurfacePoint projMouse = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);
        return isTabBeingHovered = (projMouse.x >= vx && projMouse.x <= vx + getTabWidth() + style.tabOutlineSize * 2 && projMouse.y >= vy && projMouse.y <= vy + getTabHeight() + style.tabOutlineSize * 2);
    }

    public boolean isTabBeingHovered() {
        return isTabBeingHovered;
    }

    @Override
    public void onMouseClick(MouseClickEvent e) {
        if (e.isLeftClick()) {
            oldState = newState;
            newState = e.isReleased ? 0 : 1;
        }

        if (oldState != -1 && newState == 1 && isHovering()) {
            onPress();
            return;
        }
        if (oldState != -1 && oldState != newState && newState == 0 && (isHovering() || isBeingPressed)) {
            onRelease();
        }
    }

    @Override
    public boolean isHovering() {
        return isTabBeingHovered || isBeingHoveredOver;
    }

    @Override
    public float getTotalWidth() {
        return width + 2 * style.sliderOutlineSize;
    }

    @Override
    public float getTotalHeight() {
        return height + 2 * style.sliderOutlineSize;
    }

    public float getProgress() {
        return progress;
    }

    public float getStep() {
        return step;
    }

    public float getRelativeTabX() {
        return Math.min((getProgress() * getStep()), (getMax() * getStep()) - tabWidth + style.sliderOutlineSize * 2);
    }

    public float getRelativeTabY() {
        return (tabHeight - getTotalHeight()) / 2f;
    }

    public int getTabWidth() {
        return tabWidth;
    }

    public int getTabHeight() {
        return tabHeight;
    }

    public boolean isFull() {
        return this.max == this.progress;
    }

    public int getMax() {
        return this.max;
    }
}
