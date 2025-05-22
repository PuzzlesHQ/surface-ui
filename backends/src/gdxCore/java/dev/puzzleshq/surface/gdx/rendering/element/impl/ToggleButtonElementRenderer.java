package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ButtonElement;
import dev.puzzleshq.surface.api.element.impl.ToggleButtonElement;
import dev.puzzleshq.surface.api.element.styles.ButtonStyle;
import dev.puzzleshq.surface.api.element.styles.ToggleButtonStyle;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public class ToggleButtonElementRenderer implements IElementRenderer<GDXRenderContext, ToggleButtonElement> {

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, ToggleButtonElement element) {
        Batch batch = context.getBatch();

        int rx = (int) AbstractElement.getRealX((int) context.getVPSize().x, element);
        int ry = (int) AbstractElement.getRealY((int) context.getVPSize().y, element);

        ToggleButtonStyle style = element.getStyle();

        float halfThickness = (style.outlineThickness);

        Color color = batch.getColor();

        boolean isBeingHovered = element.isBeingHovered();
        boolean isBeingPressed = element.isBeingPressed();
        boolean isOn = element.getState();

//        System.out.println(isBeingHovered);

        java.awt.Color background = isBeingHovered ? (isOn ? style.onHoverBackgroundToggedOn : style.onHoverBackgroundToggedOff) : ((isOn) ? style.onToggleOnBackground : style.onToggleOffBackground);
        java.awt.Color outline = isBeingHovered ? (isOn ? style.onHoverOutlineToggedOn : style.onHoverOutlineToggedOff) : ((isOn) ? style.onToggleOnOutline : style.onToggleOffOutline);

        GDXUtil.setColor(batch, outline);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        GDXUtil.setColor(batch, background);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + halfThickness, ry + halfThickness, element.getWidth(), element.getHeight());

        batch.setColor(color);
    }
}
