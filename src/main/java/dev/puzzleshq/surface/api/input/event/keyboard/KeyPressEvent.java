package dev.puzzleshq.surface.api.input.event.keyboard;

public class KeyPressEvent implements IKeyboardEvent {

    public int key;
    public int scancode;
    public int action;
    public int mods;

    public KeyboardKey keyboardKey;

    public KeyPressEvent(int key, int scancode, int action, int mods, KeyboardKey keyboardKey){
        this.key = key;
        this.scancode = scancode;
        this.action = action;
        this.mods = mods;

        this.keyboardKey = keyboardKey;
    }
}
