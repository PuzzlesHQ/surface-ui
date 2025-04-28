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

        int rx = (int) AbstractElement.getRealX((int) context.getViewport().getWorldWidth(), element);
        int ry = (int) AbstractElement.getRealY((int) context.getViewport().getWorldHeight(), element);

        ButtonStyle style = element.getStyle();

        float halfThickness = (style.getOutlineThickness() * .5f);

        Color color = batch.getColor();

        GDXUtil.setColor(batch, style.getDefaultOutline());
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        GDXUtil.setColor(batch, style.getDefaultBackground());
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + halfThickness, ry + halfThickness, element.getWidth(), element.getHeight());

        batch.setColor(color);
    }
}
