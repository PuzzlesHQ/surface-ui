package dev.puzzleshq.surface.api.element.styles;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;

import java.awt.*;

@NeedsDocumentation
public class ProgressBarStyle {

    public final Color full;
    public final Color empty;
    public final Color outline;

    public final float outlineThickness;

    public ProgressBarStyle(
            Color full,
            Color empty,
            Color outline,
            float outlineThickness
    ) {
        this.full = full;
        this.empty = empty;
        this.outline = outline;

        this.outlineThickness = outlineThickness;
    }


//    public static final ProgressBarStyle DEFAULT = new ProgressBarStyle(
//            new Color(7, 99, 10),
//            new Color(3, 51, 5),
//            new Color(20, 212, 26)
//    );

    public static final ProgressBarStyle DEFAULT = new ProgressBarStyle(
            new Color(6, 176, 37),
            new Color(230, 230, 230),
            new Color(188, 188, 188),
            2
    );

}
