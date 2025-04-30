package test.awtc.awt;
//import org.lwjgl.glfw.GLFW;
//import org.lwjgl.opengl.GL;

import dev.puzzleshq.surface.awt.component.SurfaceAdapter;
import dev.puzzleshq.surface.cereal.io.ScriptedSurface;
import dev.puzzleshq.surface.cereal.io.SurfaceDeserializer;
import dev.puzzleshq.util.RawAssetLoader;
import dev.puzzleshq.util.ResourceLocation;
import test.EventExecutor;

import javax.swing.*;
import java.awt.*;

public class TestAWTMain {

    public static long window;

    public static void main(String[] args) {
        EventExecutor.start();

        Dimension windowSize = new Dimension(800, 400);

        JViewport viewport = new JViewport();
        viewport.setSize(800, 400);

        JFrame frame = new JFrame("Test Screen");
        frame.add(viewport);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        ScriptedSurface screen = SurfaceDeserializer.deserialize(RawAssetLoader.getClassPathAsset(ResourceLocation.of("cereal:ui/mod-loading-screen.json")).getString());

        SurfaceAdapter surface = new SurfaceAdapter(screen) {
            @Override
            public void paint(Graphics g) {
                Graphics2D graphics2D = (Graphics2D) g;
                graphics2D.setColor(Color.BLACK);
                graphics2D.fillRect(0, 0, getWidth(), getHeight());
                super.paint(g);
            }
        };

        frame.setSize(windowSize);
        panel.add(surface);

        viewport.add(panel);
        viewport.add(surface);

        panel.setSize(windowSize.width, windowSize.height);
        surface.setBounds(0, 0, windowSize.width, windowSize.height);
        frame.setVisible(true);
//
//        if (!GLFW.glfwInit()) {
//            throw new RuntimeException("Could not initialized GLFW");
//        }
//
//        GLFW.glfwSetErrorCallback((int err, long desc) -> {
//            GLFW.glfwTerminate();
//            throw new RuntimeException(err + " | " + desc);
//        });
//
//        window = GLFW.glfwCreateWindow(500, 500, "Test Screen", 0L, 0L);
////        GLFW.glfwSetWindowAttrib(window, GLFW.GLFW_DECORATED, GLFW.GLFW_FALSE);
//        GLFW.glfwMakeContextCurrent(window);
//        GLFW.glfwShowWindow(window);
//
//        while (!GLFW.glfwWindowShouldClose(window)) {
//            GLFW.glfwSwapBuffers(window);
//            GLFW.glfwPollEvents();
//        }
//        GLFW.glfwDestroyWindow(window);
//        GLFW.glfwTerminate();

    }

}
