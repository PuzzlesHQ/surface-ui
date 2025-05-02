package dev.puzzleshq.surface.api.element.styles;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;

import java.awt.*;

@NeedsDocumentation
public class ProgressBarStyle {

    Color foregroundFull;
    Color foregroundEmpty;
    Color background;

    public ProgressBarStyle(
            Color foregroundFull,
            Color foregroundEmpty,
            Color background
    ) {
        this.foregroundFull = foregroundFull;
        this.foregroundEmpty = foregroundEmpty;
        this.background = background;
    }

    public Color getBackground() {
        return background;
    }

    public Color getForegroundEmpty() {
        return foregroundEmpty;
    }

    public Color getForegroundFull() {
        return foregroundFull;
    }

//    public static final ProgressBarStyle DEFAULT = new ProgressBarStyle(
//            new Color(7, 99, 10),
//            new Color(3, 51, 5),
//            new Color(20, 212, 26)
//    );

    public static final ProgressBarStyle DEFAULT = new ProgressBarStyle(
            new Color(6, 176, 37),
            new Color(230, 230, 230),
            new Color(188, 188, 188)
    );

}
