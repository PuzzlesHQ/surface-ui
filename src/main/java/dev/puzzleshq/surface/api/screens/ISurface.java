package dev.puzzleshq.surface.api.screens;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;

@NeedsDocumentation
public interface ISurface<T extends IRenderContext> {

    void init();
    boolean isInitialized();

    void setContext(T context);
    T getContext();

    void render();
    void update(float delta);

    Collection<IElement> getElementCollection();

    void addElement(String id, IElement element);
    IElement getElement(String id);
    void removeElement(String id);
    void clearElements();

    IElement getActiveElement();
    void setActiveElement(IElement element);

    default void postSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {};
    default void preSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {};

    default void preSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {};
    default void postSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {};

    void setId(String id);
    String getId();
}
