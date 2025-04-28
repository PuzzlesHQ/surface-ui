package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.api.element.styles.ButtonStyle;

public class ButtonElement extends AbstractElement {

    protected ButtonStyle style;

    public ButtonElement(ButtonStyle style) {
        this.width = 250;
        this.height = 50;

        this.style = style;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    @Override
    public int getTotalWidth() {
        return style.getOutlineThickness() + this.width;
    }

    @Override
    public int getTotalHeight() {
        return style.getOutlineThickness() + this.height;
    }

}
