package dev.puzzleshq.surface.api.input.event.keyboard;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface IKeyboardEvent {

    Map<Integer, KeyboardKey> GLFW_TO_KEY = new ConcurrentHashMap<>();
    Map<Integer, KeyboardKey> GDX_TO_KEY = new ConcurrentHashMap<>();

}
