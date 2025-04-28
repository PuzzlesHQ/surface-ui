package dev.puzzleshq.surface.api.module;

import dev.puzzleshq.surface.SurfaceUI;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractSurfaceModule<C extends IRenderContext> implements ISurfaceModule<C> {

    private final Map<Class<? extends IElement>, IElementRenderer<C, ?>> rendererMap;
    private final String name;

    public AbstractSurfaceModule(final String name) {
        this.rendererMap = new ConcurrentHashMap<>();
        this.name = name;

        SurfaceUI.register(name, this);
    }

    @Override
    public <E extends IElement> void register(Class<E> element, IElementRenderer<C, E> renderer) {
        this.rendererMap.put(element, renderer);
    }

    @SuppressWarnings("unchecked")
    public <T extends IElement> IElementRenderer<C, T> getElementRenderer(Class<T> elementClass) {
        return (IElementRenderer<C, T>) this.rendererMap.get(elementClass);
    }

    @Override
    public Map<Class<? extends IElement>, IElementRenderer<C, ?>> getElementRendererMap() {
        return rendererMap;
    }

    @Override
    public String getName() {
        return name;
    }
}
