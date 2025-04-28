package dev.puzzleshq.surface.awt;

import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.module.AbstractSurfaceModule;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;
import dev.puzzleshq.surface.awt.rendering.element.impl.ButtonElementRenderer;
import dev.puzzleshq.surface.awt.rendering.element.impl.ProgressBarElementRenderer;

public class SurfaceUISwing extends AbstractSurfaceModule<AWTRenderContext> {

    public static final ISurfaceModule<AWTRenderContext> INSTANCE = new SurfaceUISwing();

    public SurfaceUISwing() {
        super("Swing UI Module");
        this.register(ProgressBarElement.class, new ProgressBarElementRenderer());
        this.register(ButtonElement.class, new ButtonElementRenderer());
    }

}
