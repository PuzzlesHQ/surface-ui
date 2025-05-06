package dev.puzzleshq.surface.api.element.impl;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.util.SurfacePoint;

import java.util.function.Consumer;

@NeedsDocumentation
public class ButtonElement extends AbstractElement implements IGenericInputProcessor {

    protected ButtonStyle style;

    public ButtonElement(ButtonStyle style) {
        this.width = 250;
        this.height = 50;

        this.style = style;
    }

    Consumer<ButtonElement> elementConsumer = (b) -> {};

    public void setClickEvent(Consumer<ButtonElement> elementConsumer) {
        this.elementConsumer = elementConsumer;
    }

    public Consumer<ButtonElement> getClickEvent() {
        return this.elementConsumer;
    }

    boolean isBeingPressed = false;
    boolean isBeingHoveredOver = false;

    @Override
    public void update(ISurface surface, float delta) {
        this.isHovering(surface);
        if (isBeingPressed && !isBeingHoveredOver) {
            System.out.println(isBeingPressed + " | " + isBeingHoveredOver);
            isBeingPressed = false;
        }
    }

    public boolean isHovering(ISurface surface) {
        SurfacePoint vpSize = surface.getContext().getVPSize();

        float vx = AbstractElement.getRealX(vpSize.x, this);
        float vy = AbstractElement.getRealY(vpSize.y, this);

        SurfacePoint projMouse = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);
        isBeingHoveredOver = (projMouse.x >= vx && projMouse.x <= vx + width && projMouse.y >= vy && projMouse.y <= vy + height);
//        System.out.println(SurfaceSupervisor.MOUSE_POSITION + " | " + projMouse);
//        if (!isBeingHoveredOver) {
//            System.out.println(projMouse + " " + vx + " " + vy + " " + (vx + width) + " " + (vy + height));
//        }

        return isBeingHoveredOver;
    }

    public boolean isHovering() {
        return isHovering(SurfaceSupervisor.getCurrentSurface());
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
        isBeingPressed = false;
    }

    private void onPress() {
        isBeingPressed = true;
        this.elementConsumer.accept(this);
    }

    public boolean isBeingPressed() {
        return isBeingPressed;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    @Override
    public float getTotalWidth() {
        return style.getOutlineThickness() + this.width;
    }

    @Override
    public float getTotalHeight() {
        return style.getOutlineThickness() + this.height;
    }

}
