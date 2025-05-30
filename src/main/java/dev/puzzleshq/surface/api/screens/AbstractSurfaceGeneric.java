package dev.puzzleshq.surface.api.screens;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.input.SurfaceCoreInputProcessor;
import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;

import java.awt.*;

@NeedsDocumentation
public abstract class AbstractSurfaceGeneric<T extends IRenderContext> extends AbstractSurface<T> implements IGenericInputProcessor {

    @Override
    public void postSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {
        super.postSwitchedTo(currentSurface, oldSurface);

        SurfaceCoreInputProcessor.setProcessor(this);
    }

    protected Color backgroundColor = null;

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public void render() {
        if (backgroundColor != null)
            context.clearScreenWithColor(backgroundColor);
        
        for (IElement element : getElementCollection()) {
            ((IElementRenderer)context.getParentModule().getElementRenderer(element.getClass())).render(
                    this,
                    context,
                    element
            );
        }
    }

    public void onScroll(MouseScrollEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof IGenericInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onScroll(e);
            }
        }
    }

    public void onMouseClick(MouseClickEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof IGenericInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onMouseClick(e);
            }
        }
    }

    public void onMouseMove(MouseMoveEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof IGenericInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onMouseMove(e);
            }
        }
    }

    public void onKeyPress(KeyPressEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof IGenericInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onKeyPress(e);
            }
        }
    }

    public void onCharTyped(CharTypedEvent e) {
        for (IElement element : getElementCollection()) {
            if (element instanceof IGenericInputProcessor) {
                IGenericInputProcessor proc = (IGenericInputProcessor) element;
                proc.onCharTyped(e);
            }
        }
    }

}
