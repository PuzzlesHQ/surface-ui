package dev.puzzleshq.surface.awt.component;

import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;
import dev.puzzleshq.surface.awt.screens.AbstractAWTSurface;

import java.awt.*;

public class SurfaceAdapter extends Component {

    AbstractAWTSurface surface;
    AWTRenderContext context;

    public SurfaceAdapter(AbstractAWTSurface surface) {
        this.surface = surface;
        this.context = new AWTRenderContext(null, getWidth(), getHeight());
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);

        this.context.setBounds(x, y, width, height);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        this.context.graphics = g;
        surface.render(context);
    }
}
