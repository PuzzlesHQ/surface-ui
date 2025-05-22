package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public class ProgressBarElementRenderer implements IElementRenderer<GDXRenderContext, ProgressBarElement> {

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, ProgressBarElement element) {
        Batch batch = context.getBatch();

        int rx = (int) AbstractElement.getRealX((int) context.getVPSize().x, element);
        int ry = (int) AbstractElement.getRealY((int) context.getVPSize().y, element);

        ProgressBarStyle style = element.getStyle();

        Color color = batch.getColor();
        GDXUtil.setColor(batch, style.outline);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        boolean isFull = element.isFull();
        GDXUtil.setColor(batch, isFull ? style.full : style.empty);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + style.outlineThickness, ry + style.outlineThickness, element.getWidth(), element.getHeight());

        if (isFull) {
            batch.setColor(color);
            return;
        }

        GDXUtil.setColor(batch, style.full);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + style.outlineThickness, ry + style.outlineThickness, (int) (element.getProgress() * element.getStep()), element.getHeight());
        batch.setColor(color);
    }
}
