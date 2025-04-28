package test;

import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.rendering.AnchorX;
import dev.puzzleshq.surface.api.rendering.AnchorY;
import dev.puzzleshq.surface.api.screens.AbstractGenericSurface;
import dev.puzzleshq.surface.api.screens.ISurface;

import java.awt.*;

public class SurfaceSetup {

    public static final ProgressBarStyle REGULAR = new ProgressBarStyle(
            new Color(7, 99, 10),
            new Color(3, 51, 5),
            new Color(20, 212, 26)
    );

    public static final ProgressBarStyle RAM = new ProgressBarStyle(
            new Color(171, 171, 171),
            new Color(61, 61, 61),
            new Color(255, 255, 255)
    );

    public static void setup(ISurface<?> surface) {
        Runtime r = Runtime.getRuntime();
        int ramRange = (int) (r.maxMemory() / (1024 * 1024));

        float inc = 255f / ramRange;
        ProgressBarElement ramUsageBar = new ProgressBarElement(SurfaceSetup.RAM);
        ramUsageBar.setHeight(21);
        ramUsageBar.setMax(ramRange);
        ramUsageBar.setY(5);
        ramUsageBar.setAnchors(AnchorX.CENTER, AnchorY.TOP);

        ProgressBarElement bar1 = new ProgressBarElement(SurfaceSetup.REGULAR);
        bar1.setAnchorX(AnchorX.CENTER);
        bar1.setY(40);
        bar1.setProgress(50);

        ProgressBarElement bar2 = new ProgressBarElement(SurfaceSetup.REGULAR);
        bar2.setAnchorX(AnchorX.CENTER);
        bar2.setY(90);
        bar1.setProgress(50);

        ProgressBarElement bar3 = new ProgressBarElement(SurfaceSetup.REGULAR);
        bar3.setAnchorX(AnchorX.CENTER);
        bar3.setY(120);
        bar1.setProgress(50);

//        ButtonElement buttonElement = new ButtonElement(ButtonStyle.DEFAULT);
//        buttonElement.setAnchors(AnchorX.RIGHT, AnchorY.TOP);

        surface.addElement(ramUsageBar);
        surface.addElement(bar1);
        surface.addElement(bar2);
        surface.addElement(bar3);
//        surface.addElement(buttonElement);
    }

}
