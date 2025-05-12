package dev.puzzleshq.surface.api.element.styles;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;

import java.awt.*;

@NeedsDocumentation
public class ButtonStyle {

    private final Color defaultBackground;
    private final Color defaultOutline;
    private final Color onHoverBackground;
    private final Color onHoverOutline;
    private final Color onPressBackground;
    private final Color onPressOutline;
    private final float outlineThickness;

    public ButtonStyle(
            Color defaultBackground,
            Color defaultOutline,
            Color onHoverBackground,
            Color onHoverOutline,
            Color onPressBackground,
            Color onPressOutline,
            float outlineThickness
    ) {
        this.defaultBackground = defaultBackground;
        this.defaultOutline = defaultOutline;
        this.onHoverBackground = onHoverBackground;
        this.onHoverOutline = onHoverOutline;
        this.onPressBackground = onPressBackground;
        this.onPressOutline = onPressOutline;
        this.outlineThickness = outlineThickness;
    }

    public Color getDefaultBackground() {
        return defaultBackground;
    }

    public Color getDefaultOutline() {
        return defaultOutline;
    }

    public Color getHoverBackground() {
        return onHoverBackground != null ? onHoverBackground : getDefaultBackground();
    }

    public Color getHoverOutline() {
        return onHoverOutline != null ? onHoverOutline : getDefaultOutline();
    }

    public Color getPressBackground() {
        return onPressBackground != null ? onPressBackground : getHoverBackground();
    }

    public Color getPressOutline() {
        return onPressOutline != null ? onPressOutline : getHoverOutline();
    }

    public float getOutlineThickness() {
        return outlineThickness;
    }

    public static final ButtonStyle DEFAULT = new ButtonStyle(
            Color.BLACK, // bg-norm
            Color.DARK_GRAY, // out-norm
            Color.BLACK, // bg-norm-hover
            Color.WHITE, // out-norm-hover
            Color.DARK_GRAY, // bg-norm-pressed
            Color.WHITE, // out-norm-pressed
            1.5f
    );
}
