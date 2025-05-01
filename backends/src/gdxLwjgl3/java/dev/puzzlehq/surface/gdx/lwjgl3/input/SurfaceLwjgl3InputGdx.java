package dev.puzzlehq.surface.gdx.lwjgl3.input;

import com.badlogic.gdx.backends.lwjgl3.DefaultLwjgl3Input;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window;
import dev.puzzleshq.surface.api.input.SurfaceCoreInputProcessor;
import org.lwjgl.glfw.*;

import java.lang.reflect.Field;

public class SurfaceLwjgl3InputGdx extends DefaultLwjgl3Input {

    public SurfaceLwjgl3InputGdx(Lwjgl3Window window) {
        super(window);
    }

    private static void registerCallbacks(long window) {
        SurfaceCoreInputProcessor.SECONDARY_INPUT_PROCESSOR = new GDXInputAdapter();

        GLFW.glfwSetMouseButtonCallback(window, SurfaceCoreInputProcessor::onMouseClick);
        GLFW.glfwSetCursorPosCallback(window, SurfaceCoreInputProcessor::onCursorMove);
        GLFW.glfwSetScrollCallback(window, SurfaceCoreInputProcessor::onScroll);
        GLFW.glfwSetCursorEnterCallback(window, SurfaceCoreInputProcessor::onCursorEnter);

        GLFW.glfwSetCharCallback(window, SurfaceCoreInputProcessor::onCharTyped);
        GLFW.glfwSetKeyCallback(window, SurfaceCoreInputProcessor::onKeyPress);

        GLFW.glfwSetDropCallback(window, SurfaceCoreInputProcessor::onFileDropped);
    }

    @Override
    public void windowHandleChanged(long windowHandle) {
        GDXInputAdapter adapter = (GDXInputAdapter) SurfaceCoreInputProcessor.SECONDARY_INPUT_PROCESSOR;

        adapter.setKeyCallback((GLFWKeyCallbackI) getField("keyCallback"));
        adapter.setCharCallback((GLFWCharCallbackI) getField("charCallback"));
        adapter.setScrollCallback((GLFWScrollCallbackI) getField("scrollCallback"));
        adapter.setCursorPosCallback((GLFWCursorPosCallbackI) getField("cursorPosCallback"));
        adapter.setMouseButtonCallback((GLFWMouseButtonCallbackI) getField("mouseButtonCallback"));

        SurfaceLwjgl3InputGdx.registerCallbacks(windowHandle);
    }

    private Object getField(String name) {
        try {
            Field field = DefaultLwjgl3Input.class.getDeclaredField(name);
            field.setAccessible(true);
            return field.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}