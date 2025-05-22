package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public class ButtonElementRenderer implements IElementRenderer<GDXRenderContext, ButtonElement> {

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, ButtonElement element) {
        Batch batch = context.getBatch();

        int rx = (int) AbstractElement.getRealX((int) context.getVPSize().x, element);
        int ry = (int) AbstractElement.getRealY((int) context.getVPSize().y, element);

        ButtonStyle style = element.getStyle();

        float halfThickness = (style.getOutlineThickness());

        Color color = batch.getColor();

        boolean isBeingHovered = element.isBeingHovered();
        boolean isBeingPressed = element.isBeingPressed();

//        System.out.println(isBeingHovered);

        java.awt.Color background = isBeingPressed ? style.getPressBackground() : (isBeingHovered ? style.getHoverBackground() : style.getDefaultBackground());
        java.awt.Color outline = isBeingPressed ? style.getPressOutline() : (isBeingHovered ? style.getHoverOutline() : style.getDefaultOutline());

        GDXUtil.setColor(batch, outline);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        GDXUtil.setColor(batch, background);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + halfThickness, ry + halfThickness, element.getWidth(), element.getHeight());

        batch.setColor(color);
    }
}
