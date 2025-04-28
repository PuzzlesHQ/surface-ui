package dev.puzzleshq.surface.api.module;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;

import java.util.Map;

public interface ISurfaceModule<C extends IRenderContext> {

    String getName();

    <T extends IElement> void register(Class<T> elementClass, IElementRenderer<C, T> elementRenderer);
    <T extends IElement> IElementRenderer<C, T> getElementRenderer(Class<T> aClass);

    Map<Class<? extends IElement>, IElementRenderer<C, ?>> getElementRendererMap();
}
