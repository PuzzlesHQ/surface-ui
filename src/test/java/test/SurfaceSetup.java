package test;

import dev.puzzleshq.surface.api.element.impl.PanelElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.PanelStyle;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.rendering.AnchorX;
import dev.puzzleshq.surface.api.rendering.AnchorY;
import dev.puzzleshq.surface.api.screens.ISurface;

import java.awt.*;

public class SurfaceSetup {

    public static final ProgressBarStyle REGULAR = new ProgressBarStyle(
            new Color(7, 99, 10),
            new Color(3, 51, 5),
            new Color(20, 212, 26),
            2
    );

    public static final ProgressBarStyle RAM = new ProgressBarStyle(
            new Color(171, 171, 171),
            new Color(61, 61, 61),
            new Color(255, 255, 255),
            2
    );

    public static void setup(ISurface<?> surface) {
        PanelElement element = new PanelElement(new PanelStyle(Color.BLUE));
        element.setAnchors(AnchorX.CENTER, AnchorY.CENTER);

        PanelElement superPanel = new PanelElement(new PanelStyle(Color.RED));
        superPanel.setSize(600, 600);
        superPanel.setAnchors(AnchorX.CENTER, AnchorY.CENTER);

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

        element.addElement("ram-usage-bar", ramUsageBar);
        element.addElement("progress-bar-1", bar1);
        element.addElement("progress-bar-2", bar2);
        element.addElement("progress-bar-3", bar3);

        superPanel.addElement("panel", element);
        surface.addElement("super-panel", superPanel);
//        surface.addElement(buttonElement);
    }

}
