package dev.puzzleshq.surface.awt.screens;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.AbstractGenericSurface;
import dev.puzzleshq.surface.awt.SurfaceUISwing;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;

import java.awt.*;

public abstract class AbstractAWTSurface extends AbstractGenericSurface<AWTRenderContext> {

    public AbstractAWTSurface() {
        init();
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void render(AWTRenderContext context) {
        Graphics graphics = context.getGraphics();

        for (IElement element : elements) {
            IElementRenderer renderer = element.getRenderer(SurfaceUISwing.INSTANCE);
            if (renderer != null)
                renderer.render(this, context, element);
        }
    }

}
