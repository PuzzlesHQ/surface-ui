package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.SurfacePoint;

public abstract class AbstractInteractableElement extends AbstractElement implements IGenericInputProcessor {

    boolean isBeingPressed = false;
    boolean isBeingHoveredOver = false;

    @Override
    public void update(ISurface surface, float delta) {
        this.isHovering(surface);
        if (isBeingPressed && !isBeingHoveredOver) {
            isBeingPressed = false;
        }
    }

    protected int oldState = -1;
    protected int newState;

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
        if (oldState != -1 && oldState != newState && newState == 0 && isHovering()) {
            onRelease();
        }
    }

    protected void onRelease() {
        isBeingPressed = false;
    }

    protected void onPress() {
        isBeingPressed = true;
    }

    public boolean isBeingPressed() {
        return isBeingPressed;
    }

    SurfacePoint point = new SurfacePoint();
    public void isHovering(ISurface surface) {
        SurfacePoint vpSize = surface.getContext().getVPSize();

        float vx = AbstractElement.getRealX(vpSize.x, this);
        float vy = AbstractElement.getRealY(vpSize.y, this);

        SurfacePoint projMouse = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);
        isBeingHoveredOver = (projMouse.x >= vx && projMouse.x <= vx + getTotalWidth() && projMouse.y >= vy && projMouse.y <= vy + getTotalHeight());
    }

    public boolean isHovering() {
        return isBeingHoveredOver;
    }

    public boolean isBeingHovered() {
        return isBeingHoveredOver;
    }

}
