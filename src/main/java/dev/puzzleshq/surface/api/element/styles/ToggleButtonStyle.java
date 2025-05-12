package dev.puzzleshq.surface.api.element.styles;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.util.Colors;

import java.awt.*;

@NeedsDocumentation
public class ToggleButtonStyle {

    public final Color onHoverBackgroundToggedOn;
    public final Color onHoverOutlineToggedOn;
    public final Color onToggleOnBackground;
    public final Color onToggleOnOutline;

    public final Color onHoverBackgroundToggedOff;
    public final Color onHoverOutlineToggedOff;
    public final Color onToggleOffBackground;
    public final Color onToggleOffOutline;

    public final float outlineThickness;

    public ToggleButtonStyle(
            Color onHoverBackgroundToggedOn,
            Color onHoverOutlineToggedOn,
            Color onHoverBackgroundToggedOff,
            Color onHoverOutlineToggedOff,

            Color onToggleOnBackground,
            Color onToggleOnOutline,
            Color onToggleOffBackground,
            Color onToggleOffOutline,
            float outlineThickness
    ) {
        this.onHoverBackgroundToggedOn = onHoverBackgroundToggedOn;
        this.onHoverOutlineToggedOn = onHoverOutlineToggedOn;
        this.onToggleOnBackground = onToggleOnBackground;
        this.onToggleOnOutline = onToggleOnOutline;

        this.onHoverBackgroundToggedOff = onHoverBackgroundToggedOff;
        this.onHoverOutlineToggedOff = onHoverOutlineToggedOff;
        this.onToggleOffBackground = onToggleOffBackground;
        this.onToggleOffOutline = onToggleOffOutline;

        this.outlineThickness = outlineThickness;
    }

    public static final ToggleButtonStyle DEFAULT = new ToggleButtonStyle(
            Colors.DARK_GRAY, // hover-on-bg
            Colors.WHITE, // hover-on-out
            Colors.BLACK, // hover-off-bg
            Colors.WHITE, // hover-off-out

            Colors.WHITE, // toggled-on-bg
            Colors.DARK_GRAY, // toggled-on-out
            Colors.BLACK, // toggled-off-bg
            Colors.GRAY, // toggled-off-out

            2
    );
}
