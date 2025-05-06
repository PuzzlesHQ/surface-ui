package dev.puzzleshq.surface.gdx.screens;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.AbstractSurfaceGeneric;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public abstract class AbstractGdxSurface extends AbstractSurfaceGeneric<GDXRenderContext> {

    public AbstractGdxSurface() {
        init();
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void render() {
        for (IElement element : getElementCollection()) {
            IElementRenderer renderer = element.getRenderer(SurfaceUIGdx.INSTANCE);
            if (renderer != null)
                renderer.render(this, context, element);
        }
    }

}
