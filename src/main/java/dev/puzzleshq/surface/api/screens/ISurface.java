package dev.puzzleshq.surface.api.screens;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;

public interface ISurface<T extends IRenderContext> {

    void init();
    boolean isInitialized();

    void render(T context);
    void update(float delta);

    Collection<IElement> getElementCollection();

    void addElement(IElement element);
    void removeElement(IElement element);
    void clearElements();

}
