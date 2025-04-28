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

        int rx = (int) AbstractElement.getRealX((int) context.getViewport().getWorldWidth(), element);
        int ry = (int) AbstractElement.getRealY((int) context.getViewport().getWorldHeight(), element);

        ProgressBarStyle style = element.getStyle();

        Color color = batch.getColor();
        GDXUtil.setColor(batch, style.getBackground());
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        boolean isFull = element.isFull();
        GDXUtil.setColor(batch, isFull ? style.getForegroundFull() : style.getForegroundEmpty());
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + 2, ry + 2, element.getWidth(), element.getHeight());

        if (isFull) {
            batch.setColor(color);
            return;
        }

        GDXUtil.setColor(batch, style.getForegroundFull());
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + 2, ry + 2, (int) (element.getProgress() * element.getStep()), element.getHeight());
        batch.setColor(color);
    }
}
