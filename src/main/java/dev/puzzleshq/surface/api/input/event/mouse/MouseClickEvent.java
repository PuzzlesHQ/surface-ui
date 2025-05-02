package dev.puzzleshq.surface.api.input.event.mouse;

public abstract class MouseClickEvent implements IMouseEvent {

    public int button;
    public int action;
    public int modifiers;

    public boolean isReleased;

    public MouseClickEvent(int button, int action, int modifiers, boolean isReleased){
        this.button = button;
        this.action = action;
        this.modifiers = modifiers;

        this.isReleased = isReleased;
    }

    public abstract boolean isLeftClick();
    public abstract boolean isRightClick();
    public abstract boolean isScrollWheelClick();
}
