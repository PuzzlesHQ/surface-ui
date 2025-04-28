package dev.puzzleshq.surface.api.screens;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.input.ISurfaceInputProcessor;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class AbstractGenericSurface<T extends IRenderContext> implements ISurface<T>, ISurfaceInputProcessor {

    protected Collection<IElement> elements;

    protected boolean isInitialized;

    @Override
    public void init() {
        elements = new ConcurrentLinkedQueue<>();

        isInitialized = true;
    }

    @Override
    public boolean isInitialized() {
        return isInitialized;
    }

    @Override
    public void addElement(IElement element) {
        this.elements.add(element);
    }

    @Override
    public void removeElement(IElement element) {
        this.elements.remove(element);
    }

    @Override
    public void clearElements() {
        this.elements.clear();
    }

    @Override
    public void update(float delta) {}

    @Override
    public Collection<IElement> getElementCollection() {
        return elements;
    }

    @Override
    public void onCharTyped(long window, int codepoint) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCharTyped(window, codepoint);
            }
        }
    }

    @Override
    public void onCursorEnter(long window, boolean entered) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCursorEnter(window, entered);
            }
        }
    }

    @Override
    public void onCursorMove(long window, double x, double y) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCursorMove(window, x, y);
            }
        }
    }

    @Override
    public void onFileDropped(long window, int count, long paths) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onFileDropped(window, count, paths);
            }
        }
    }

    @Override
    public void onKeyPress(long window, int key, int scancode, int action, int mods) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onKeyPress(window, key, scancode, action, mods);
            }
        }
    }

    @Override
    public void onMouseClick(long window, int button, int action, int mods) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onMouseClick(window, button, action, mods);
            }
        }
    }

    @Override
    public void onScroll(long window, double xOffset, double yOffset) {
        for (IElement e : elements) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onScroll(window, xOffset, yOffset);
            }
        }
    }

}
