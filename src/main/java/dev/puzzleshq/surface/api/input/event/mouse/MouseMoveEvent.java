package dev.puzzleshq.surface.api.input.event.mouse;

public class MouseMoveEvent implements IMouseEvent {

    public double x;
    public double y;

    public MouseMoveEvent(double x, double y){
        this.x = x;
        this.y = y;
    }
}
