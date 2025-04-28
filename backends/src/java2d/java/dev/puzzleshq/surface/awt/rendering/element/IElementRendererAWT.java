package dev.puzzleshq.surface.awt.rendering.element;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;

public interface IElementRendererAWT<T extends IElement> extends IElementRenderer<AWTRenderContext, T> {
}
