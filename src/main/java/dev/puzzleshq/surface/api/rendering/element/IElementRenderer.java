package dev.puzzleshq.surface.api.rendering.element;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.screens.ISurface;

@NeedsDocumentation
public interface IElementRenderer<C extends IRenderContext, T extends IElement> {

    void render(final ISurface<C> surface, final C context, final T element);

}
