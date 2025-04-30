package dev.puzzleshq.surface.awt.component;

import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.awt.rendering.context.impl.AWTRenderContext;

import java.awt.*;

public class SurfaceAdapter extends Component {

    ISurface surface;
    AWTRenderContext context;

    public SurfaceAdapter(ISurface surface) {
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
