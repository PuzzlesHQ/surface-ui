package dev.puzzleshq.surface.api.screens;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@NeedsDocumentation
public abstract class AbstractSurface<T extends IRenderContext> implements ISurface<T> {

    protected Map<String, IElement> elementMap;
    protected IElement activeElement;

    protected String id;
    protected boolean isInitialized;

    protected T context;

    @Override
    public void setContext(T context) {
        this.context = context;
    }

    @Override
    public T getContext() {
        return context;
    }

    @Override
    public void init() {
        elementMap = new ConcurrentHashMap<>();

        isInitialized = true;
    }

    @Override
    public boolean isInitialized() {
        return isInitialized;
    }

    @Override
    public void addElement(String id, IElement element) {
        this.elementMap.put(id, element);
    }

    @Override
    public IElement getElement(String id) {
        return this.elementMap.get(id);
    }

    @Override
    public void removeElement(String id) {
        this.elementMap.remove(id);
    }

    @Override
    public void clearElements() {
        this.elementMap.clear();
    }

    @Override
    public IElement getActiveElement() {
        return this.activeElement;
    }

    @Override
    public void setActiveElement(IElement element) {
        this.activeElement = element;
    }

    @Override
    public void update(float delta) {
        for (IElement e : getElementCollection()) {
//            System.out.println(delta);
            e.update(this, delta);
        }
    }

    @Override
    public Collection<IElement> getElementCollection() {
        return elementMap.values();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        if (this.id != null) return;

        this.id = id;
    }

    @Override
    public String toString() {
        return "{ Surface: '" + getId() + "' }";
    }
}
