package dev.puzzleshq.surface.api.element.impl;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.input.IGenericInputProcessor;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.FiveInputFunction;
import dev.puzzleshq.surface.util.SurfacePoint;

@NeedsDocumentation
public class ButtonElement extends AbstractElement implements IGenericInputProcessor {

    protected ButtonStyle style;
    private static FiveInputFunction<ButtonElement, Long, Integer, Integer, Integer, Boolean> detection;

    public static void setMouseClickDetection(FiveInputFunction<ButtonElement, Long, Integer, Integer, Integer, Boolean> detection) {
        ButtonElement.detection = detection;
    }

    public ButtonElement(ButtonStyle style) {
        this.width = 250;
        this.height = 50;

        this.style = style;
    }

    boolean isBeingHoveredOver = false;

    @Override
    public void update(ISurface surface, float delta) {

    }

    int oldState = -1;
    int newState;

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

    private void onRelease() {
    }

    private void onPress() {
    }

    public boolean isHovering() {
        float vx = AbstractElement.getRealX(getTotalWidth(), this);
        float vy = AbstractElement.getRealX(getTotalHeight(), this);

        SurfacePoint projMouse = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);

        return projMouse.x >= vx && projMouse.x <= vx + width && projMouse.y >= vy && projMouse.y <= vy + height;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    @Override
    public int getTotalWidth() {
        return style.getOutlineThickness() + this.width;
    }

    @Override
    public int getTotalHeight() {
        return style.getOutlineThickness() + this.height;
    }

}
