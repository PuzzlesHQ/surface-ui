package dev.puzzlehq.surface.gdx.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window;
import dev.puzzlehq.surface.gdx.lwjgl3.input.AutoGenericToGlfwInputAdapter;
import dev.puzzlehq.surface.gdx.lwjgl3.input.GLFWCallbackInputAdapter;
import dev.puzzlehq.surface.gdx.lwjgl3.input.SurfaceLwjgl3InputGdx;
import dev.puzzleshq.surface.api.input.SurfaceCoreInputProcessor;

import java.lang.reflect.Field;

public class SurfaceUILwjgl3Gdx {

    public static void addSurfaceInputCapabilities() {
        SurfaceCoreInputProcessor.INTERNAL_GDX_PROCESSOR_INPUT = new GLFWCallbackInputAdapter();
        SurfaceCoreInputProcessor.INTERNAL_GENERIC_PROCESSOR = new AutoGenericToGlfwInputAdapter();

        Gdx.input = new SurfaceLwjgl3InputGdx(SurfaceUILwjgl3Gdx.getCurrentWindow());
    }

    public static Lwjgl3Window getCurrentWindow() {
        try {
            Field field = Lwjgl3Application.class.getDeclaredField("currentWindow");
            field.setAccessible(true);
            return (Lwjgl3Window) field.get(Gdx.app);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
