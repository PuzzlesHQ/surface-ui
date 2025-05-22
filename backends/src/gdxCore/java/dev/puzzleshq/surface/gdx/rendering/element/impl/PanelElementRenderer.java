package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.HdpiUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.PanelElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.SurfaceUIGdx;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;
import dev.puzzleshq.surface.gdx.rendering.context.impl.PanelRenderContext;
import dev.puzzleshq.surface.util.SurfacePoint;

public class PanelElementRenderer implements IElementRenderer<GDXRenderContext, PanelElement> {

    GDXRenderContext panelContext;

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, PanelElement panel) {
        Batch batch = context.getBatch();

        Color color = batch.getColor();

        SurfacePoint point = new SurfacePoint();

        int rx = (int) AbstractElement.getRealX(context.getVPSize().x, panel);
        int ry = (int) AbstractElement.getRealY(context.getVPSize().y, panel);
        GDXUtil.setColor(batch, panel.getStyle().backgroundColor);
        batch.draw(SurfaceUIGdx.WHITE_PIXEL, rx, ry, panel.getWidth(), panel.getHeight());

        Camera c = context.getCamera();
        if (context instanceof PanelRenderContext co) c = co.getOGCamera();

        Vector3 v = c.project(new Vector3(rx + .5f, ry + context.getVPSize().y * .5f + .5f, 0));
        Vector3 a = c.project(new Vector3(rx + panel.getWidth(), ry + panel.getHeight() + context.getVPSize().y * .5f + .5f, 0));

        batch.flush();
        Gdx.gl.glEnable(GL20.GL_SCISSOR_TEST);
        HdpiUtils.glScissor((int) v.x, (int) v.y, (int) (Math.abs(v.x - a.x)), (int) (Math.abs(v.y - a.y)));

        this.panelContext = new PanelRenderContext(context.getBatch(), panel, context, context.getCamera());

        for (IElement element : panel.getElementCollection()) {
            ((IElementRenderer)panelContext.getParentModule().getElementRenderer(element.getClass())).render(
                    surface,
                    panelContext,
                    element
            );
        }

        batch.setColor(color);
        batch.flush();
        Gdx.gl.glDisable(GL20.GL_SCISSOR_TEST);
    }
}
