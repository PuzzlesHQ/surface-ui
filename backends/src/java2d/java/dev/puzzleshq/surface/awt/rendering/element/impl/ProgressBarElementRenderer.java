package dev.puzzleshq.surface.awt.rendering.element.impl;

import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.awt.rendering.context.ScreenBounds;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTQuadrentSpace;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;
import dev.puzzleshq.surface.awt.rendering.element.IElementRendererAWT;

import java.awt.*;

public class ProgressBarElementRenderer implements IElementRendererAWT<ProgressBarElement> {

    @Override
    public void render(ISurface<AWTRenderContext> surface, AWTRenderContext context, ProgressBarElement element) {
        Graphics2D graphics2D = (Graphics2D) context.getGraphics();

        ScreenBounds bounds = context.getBounds();
        AWTQuadrentSpace space = context.getSpace();

        int rx = (int) space.transformX(AbstractElement.getRealX(bounds.getWidth(), element));
        int ry = (int) space.transformY(AbstractElement.getRealY(bounds.getHeight(), element));

        ProgressBarStyle style = element.getStyle();

        Color color = graphics2D.getColor();
        graphics2D.setColor(style.getBackground());
        graphics2D.fillRect(rx, ry, element.getWidth() + 4, element.getHeight() + 4);

        boolean isFull = element.isFull();
        graphics2D.setColor(isFull ? style.getForegroundFull() : style.getForegroundEmpty());
        graphics2D.fillRect(rx + 2, ry + 2, element.getWidth(), element.getHeight());

        if (isFull) {
            graphics2D.setColor(color);
            return;
        }

        graphics2D.setColor(style.getForegroundFull());
        graphics2D.fillRect(rx + 2, ry + 2, (int) (element.getProgress() * element.getStep()), element.getHeight());
        graphics2D.setColor(color);
    }
}
