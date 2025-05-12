package dev.puzzleshq.surface.lwjgl3.rendering;

import dev.puzzleshq.surface.api.rendering.context.AbstractRenderContext;
import dev.puzzleshq.surface.lwjgl3.SurfaceUILwjgl3;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class LwjglRenderContext extends AbstractRenderContext {

    public LwjglRenderContext() {
        super(SurfaceUILwjgl3.INSTANCE, "Lwjgl3 Render Context");
    }

    @Override
    public void clearScreenWithColor(Color backgroundColor) {
        GL11.glClearColor(backgroundColor.getRed() / 255f, backgroundColor.getGreen() / 255f, backgroundColor.getBlue() / 255f, backgroundColor.getAlpha() / 255f);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT | GL11.GL_COLOR_BUFFER_BIT);
    }

}
