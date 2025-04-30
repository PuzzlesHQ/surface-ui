package dev.puzzleshq.surface.api.screens;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;

@NeedsDocumentation
public interface ISurface<T extends IRenderContext> {

    void init();
    boolean isInitialized();

    void render(T context);
    void update(float delta);

    Collection<IElement> getElementCollection();

    void addElement(String id, IElement element);
    IElement getElement(String id);
    void removeElement(String id);
    void clearElements();

    default void postSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {};
    default void preSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {};

    default void preSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {};
    default void postSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {};
}
