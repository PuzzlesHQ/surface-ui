package dev.puzzleshq.surface.gdx.rendering.context.impl;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector3;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.PanelElement;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;

public class PanelRenderContext extends GDXRenderContext {

    PanelElement element;
    IRenderContext parent;

    static final OrthographicCamera TEMP_CAMERA;
    static {
        TEMP_CAMERA = new OrthographicCamera();

        TEMP_CAMERA.up.set(0.0F, -1.0F, 0.0F);
        TEMP_CAMERA.direction.set(0.0F, 0.0F, 1.0F);
        TEMP_CAMERA.update();
    }

    public PanelRenderContext(Batch batch, PanelElement element, IRenderContext parent, Camera og) {
        super(batch, null, og);

        this.element = element;
        this.setVpSize(element, parent, og);
        this.parent = parent;
    }

    private void setVpSize(PanelElement element, IRenderContext context, Camera og) {
        int rx = (int) AbstractElement.getRealX(context.getVPSize().x, element);
        int ry = (int) AbstractElement.getRealY(context.getVPSize().y, element);

        Vector3 vp = new Vector3(rx + .5f, ry + context.getVPSize().y * .5f + .5f, 0);
        Vector3 ap = new Vector3(rx + .5f + element.getWidth(), ry + element.getHeight() + context.getVPSize().y * .5f + .5f, 0);

        Vector3 v = og.project(vp.cpy());
        Vector3 a = og.project(ap.cpy());

        System.err.println(rx + " " + ry + " | " + vp + ", " + ap + " | " + v + ", " + a);
        this.setVpSize((int) (Math.abs(a.x - v.x)), (int) (Math.abs(a.y - v.y)));
    }

    @Override
    public Camera getCamera() {
        return TEMP_CAMERA;
    }

    public Camera getOGCamera() {
        return super.getCamera();
    }

    @Override
    public void setVpSize(float x, float y) {
        super.setVpSize(x, y);

        TEMP_CAMERA.setToOrtho(false, x, y);
        TEMP_CAMERA.position.set(x / 2, y / 2, 0);
        TEMP_CAMERA.update();
    }
}
