package dev.puzzleshq.surface.gdx.screens;

import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.AbstractGenericSurface;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public abstract class AbstractGdxSurface extends AbstractGenericSurface<GDXRenderContext> {

    public AbstractGdxSurface() {
        init();
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void render(GDXRenderContext context) {
        for (IElement element : elements) {
            IElementRenderer renderer = element.getRenderer(SurfaceUIGdx.INSTANCE);
            if (renderer != null)
                renderer.render(this, context, element);
        }
    }

}
