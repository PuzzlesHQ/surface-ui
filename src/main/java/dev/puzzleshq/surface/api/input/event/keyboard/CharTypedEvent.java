package dev.puzzleshq.surface.api.input.event.keyboard;

public class CharTypedEvent implements IKeyboardEvent {

    public int codepoint;

    public CharTypedEvent(int codepoint){
        this.codepoint = codepoint;
    }
}
