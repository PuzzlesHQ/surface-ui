package dev.puzzleshq.surface.awt.rendering.element.impl;

import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTQuadrentSpace;
import dev.puzzleshq.surface.awt.rendering.context.ScreenBounds;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;

import java.awt.*;

public class ButtonElementRenderer implements IElementRenderer<AWTRenderContext, ButtonElement> {

    @Override
    public void render(ISurface<AWTRenderContext> surface, AWTRenderContext context, ButtonElement element) {
        Graphics2D graphics2D = (Graphics2D) context.getGraphics();

        ScreenBounds bounds = context.getBounds();
        AWTQuadrentSpace space = context.getSpace();

        int rx = (int) space.transformX(AbstractElement.getRealX(bounds.getWidth(), element));
        int ry = (int) space.transformY(AbstractElement.getRealY(bounds.getHeight(), element));

        ButtonStyle style = element.getStyle();
        float halfThickness = (style.getOutlineThickness() * .5f);

        Color color = graphics2D.getColor();
        graphics2D.setColor(style.getDefaultOutline());
        graphics2D.fillRect(rx, ry, element.getTotalWidth(), element.getTotalHeight());

        graphics2D.setColor(style.getDefaultBackground());
        graphics2D.fillRect((int) (rx + halfThickness), (int) (ry + halfThickness), element.getWidth(), element.getHeight());

        graphics2D.setColor(color);
    }
}
