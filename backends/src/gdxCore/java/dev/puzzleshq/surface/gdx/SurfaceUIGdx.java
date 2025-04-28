package dev.puzzleshq.surface.gdx;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import dev.puzzleshq.surface.SurfaceUI;
import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.module.AbstractSurfaceModule;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;
import dev.puzzleshq.surface.gdx.rendering.element.impl.ButtonElementRenderer;
import dev.puzzleshq.surface.gdx.rendering.element.impl.ProgressBarElementRenderer;

import java.awt.*;

public class SurfaceUIGdx extends AbstractSurfaceModule<GDXRenderContext> {

    public static final ISurfaceModule<GDXRenderContext> INSTANCE = new SurfaceUIGdx();

    public static Texture WHITE_PIXEL;

    public static void init() {
        Pixmap pixmap = new Pixmap(1, 1, Pixmap.Format.RGB888);
        pixmap.drawPixel(0, 0, Color.WHITE.getRGB());
        WHITE_PIXEL = new Texture(pixmap);
    }

    public SurfaceUIGdx() {
        super("Gdx UI Module");

        SurfaceUIGdx.init();
        this.register(ProgressBarElement.class, new ProgressBarElementRenderer());
        this.register(ButtonElement.class, new ButtonElementRenderer());
    }

}
