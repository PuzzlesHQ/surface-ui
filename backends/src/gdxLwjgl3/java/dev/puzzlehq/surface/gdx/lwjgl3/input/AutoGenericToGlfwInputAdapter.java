package dev.puzzlehq.surface.gdx.lwjgl3.input;

import dev.puzzleshq.surface.api.input.ISurfaceInputProcessor;
import dev.puzzleshq.surface.api.input.SurfaceCoreInputProcessor;
import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.IKeyboardEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;
import org.lwjgl.glfw.GLFW;

public class AutoGenericToGlfwInputAdapter implements ISurfaceInputProcessor {

    public AutoGenericToGlfwInputAdapter() {
    }

    public void onScroll(long window, double xOffset, double yOffset) {
        if (SurfaceCoreInputProcessor.getProcessor() instanceof IGenericInputProcessor processor)
            processor.onScroll(new MouseScrollEvent(xOffset, yOffset));
    }
    
    public void onCursorEnter(long window, boolean entered) {}
    
    public void onMouseClick(long window, int button, int action, int mods) {
        if (SurfaceCoreInputProcessor.getProcessor() instanceof IGenericInputProcessor processor) {
            processor.onMouseClick(new MouseClickEvent(button, action, mods, action == GLFW.GLFW_RELEASE) {
                @Override
                public boolean isLeftClick() {
                    return button == GLFW.GLFW_MOUSE_BUTTON_LEFT;
                }

                @Override
                public boolean isRightClick() {
                    return button == GLFW.GLFW_MOUSE_BUTTON_RIGHT;
                }

                @Override
                public boolean isScrollWheelClick() {
                    return button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE;
                }
            });
        }
    }
    
    public void onCursorMove(long window, double x, double y) {
        if (SurfaceCoreInputProcessor.getProcessor() instanceof IGenericInputProcessor processor)
            processor.onMouseMove(new MouseMoveEvent(x, y));
    }

    public void onKeyPress(long window, int key, int scancode, int action, int mods) {
        if (SurfaceCoreInputProcessor.getProcessor() instanceof IGenericInputProcessor processor)
            processor.onKeyPress(new KeyPressEvent(key, scancode, action, mods, IKeyboardEvent.GLFW_TO_KEY.get(key)));
    }
    
    public void onCharTyped(long window, int codepoint) {
        if (SurfaceCoreInputProcessor.getProcessor() instanceof IGenericInputProcessor processor)
            processor.onCharTyped(new CharTypedEvent(codepoint));
    }

    public void onFileDropped(long window, int count, long paths) {}

}
