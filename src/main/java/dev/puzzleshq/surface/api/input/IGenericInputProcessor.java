package dev.puzzleshq.surface.api.input;

import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;

public interface IGenericInputProcessor {

    default void onScroll(MouseScrollEvent e) {}
    default void onMouseClick(MouseClickEvent e) {}
    default void onMouseMove(MouseMoveEvent e) {}

    default void onKeyPress(KeyPressEvent e) {}
    default void onCharTyped(CharTypedEvent e) {}

}
