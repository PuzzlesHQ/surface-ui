package dev.puzzleshq.surface.api.screens;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.input.ISurfaceInputProcessor;
import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@NeedsDocumentation
public abstract class AbstractSurfaceCmplx<T extends IRenderContext> implements ISurface<T>, ISurfaceInputProcessor{

    @Override
    public void onCharTyped(long window, int codepoint) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCharTyped(window, codepoint);
            }
        }
    }

    @Override
    public void onCursorEnter(long window, boolean entered) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCursorEnter(window, entered);
            }
        }
    }

    @Override
    public void onCursorMove(long window, double x, double y) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onCursorMove(window, x, y);
            }
        }
    }

    @Override
    public void onFileDropped(long window, int count, long paths) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onFileDropped(window, count, paths);
            }
        }
    }

    @Override
    public void onKeyPress(long window, int key, int scancode, int action, int mods) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onKeyPress(window, key, scancode, action, mods);
            }
        }
    }

    @Override
    public void onMouseClick(long window, int button, int action, int mods) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onMouseClick(window, button, action, mods);
            }
        }
    }

    @Override
    public void onScroll(long window, double xOffset, double yOffset) {
        for (IElement e : getElementCollection()) {
            if (e instanceof ISurfaceInputProcessor) {
                ISurfaceInputProcessor element = (ISurfaceInputProcessor) e;
                element.onScroll(window, xOffset, yOffset);
            }
        }
    }

    public void onScroll(MouseScrollEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof ISurfaceInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onScroll(e);
            }
        }
    }

}
