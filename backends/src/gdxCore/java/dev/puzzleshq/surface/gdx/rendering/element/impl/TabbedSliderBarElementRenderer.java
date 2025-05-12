package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.TabbedSliderBar;
import dev.puzzleshq.surface.api.element.styles.TabbedSliderBarStyle;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public class TabbedSliderBarElementRenderer implements IElementRenderer<GDXRenderContext, TabbedSliderBar> {

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, TabbedSliderBar element) {
        Batch batch = context.getBatch();

        int rx = (int) AbstractElement.getRealX((int) context.getViewport().getWorldWidth(), element);
        int ry = (int) AbstractElement.getRealY((int) context.getViewport().getWorldHeight(), element);

        TabbedSliderBarStyle style = element.getStyle();

        Color color = batch.getColor();
        GDXUtil.setColor(batch, style.outline);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, element.getTotalWidth(), element.getTotalHeight());

        boolean isFull = element.isFull();
        GDXUtil.setColor(batch, isFull ? style.full : style.empty);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + style.sliderOutlineSize, ry + style.sliderOutlineSize, element.getWidth(), element.getHeight());

        if (isFull) {
            this.drawTab(batch, rx, ry, surface, context, element, style);
            batch.setColor(color);
            return;
        }

        GDXUtil.setColor(batch, style.full);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + style.sliderOutlineSize, ry + style.sliderOutlineSize, (int) (element.getProgress() * element.getStep()), element.getHeight());

        this.drawTab(batch, rx, ry, surface, context, element, style);

//        boolean isFull = element.isFull();
//        GDXUtil.setColor(batch, isFull ? style.getForegroundFull() : style.getForegroundEmpty());
//        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx + 2, ry + 2, element.getWidth(), element.getHeight());

//        if (isFull) {
//            batch.setColor(color);
//            return;
//        }
//
        batch.setColor(color);
    }

    private void drawTab(Batch batch, int rx, int ry, ISurface<GDXRenderContext> surface, GDXRenderContext context, TabbedSliderBar element, TabbedSliderBarStyle style) {
        float tabOutlineSize = style.tabOutlineSize;
        float tabOutlineSize2x = tabOutlineSize * 2;

        float tabWidth = element.getTabWidth() + tabOutlineSize2x;
        float tabHeight = element.getTabHeight() + tabOutlineSize2x;

        float tabPositionX = rx + element.getRelativeTabX();
        float tabPositionY = ry - element.getRelativeTabY();

        GDXUtil.setColor(batch, style.tabOutline);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL,
                tabPositionX,
                tabPositionY,
                tabWidth,
                tabHeight
        );

        GDXUtil.setColor(batch, style.tabBackground);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL,
                tabPositionX + tabOutlineSize,
                tabPositionY + tabOutlineSize,
                tabWidth - tabOutlineSize2x,
                tabHeight - tabOutlineSize2x
        );
    }
}
