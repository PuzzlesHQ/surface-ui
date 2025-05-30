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
            isBeingPressed = false;
        }
    }

    SurfacePoint point = new SurfacePoint();
    public boolean isHovering(ISurface surface) {
        SurfacePoint vpSize = surface.getContext().getVPSize();

        float vx = AbstractElement.getRealX(vpSize.x, this);
        float vy = AbstractElement.getRealY(vpSize.y, this);

        SurfacePoint projMouse = SurfaceSupervisor.unprojectPoint(SurfaceSupervisor.MOUSE_POSITION);
        isBeingHoveredOver = (projMouse.x >= vx && projMouse.x <= vx + width && projMouse.y >= vy && projMouse.y <= vy + height);

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

    public void setStyle(ButtonStyle style) {
        this.style = style;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    @Override
    public float getTotalWidth() {
        return 2 * style.getOutlineThickness() + this.width;
    }

    @Override
    public float getTotalHeight() {
        return 2 * style.getOutlineThickness() + this.height;
    }

    public boolean isBeingHovered() {
        return isBeingHoveredOver;
    }
}
