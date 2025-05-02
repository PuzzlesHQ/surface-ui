package dev.puzzleshq.surface.api.input.event.mouse;

public class MouseScrollEvent implements IMouseEvent {

    public double xOffset;
    public double yOffset;

    public MouseScrollEvent(double xOffset, double yOffset){
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

}
