package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.element.styles.PanelStyle;
import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;
import dev.puzzleshq.surface.api.input.generic.IGenericInputProcessor;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PanelElement extends AbstractElement implements IGenericInputProcessor {

    protected Map<String, IElement> elementMap;

    private PanelStyle style;

    public PanelElement() {
        this(PanelStyle.DEFAULT);
    }

    public PanelElement(PanelStyle style) {
        this.style = style;
        this.width = 300;
        this.height = 300;

        this.elementMap = new ConcurrentHashMap<>();
    }

    public void addElement(String id, IElement element) {
        this.elementMap.put(id, element);
    }

    public IElement getElement(String id) {
        return this.elementMap.get(id);
    }

    public void removeElement(String id) {
        this.elementMap.remove(id);
    }

    public void clearElements() {
        this.elementMap.clear();
    }

    public PanelStyle getStyle() {
        return style;
    }

    public void setStyle(PanelStyle style) {
        this.style = style;
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

    public Collection<IElement> getElementCollection() {
        return this.elementMap.values();
    }
}
