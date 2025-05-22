package dev.puzzleshq.surface.api.element.styles;

import java.awt.*;

public class PanelStyle {

    public final Color backgroundColor;

    public PanelStyle(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public static final PanelStyle DEFAULT = new PanelStyle(Color.BLACK);

}
