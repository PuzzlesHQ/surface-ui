package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.util.SurfacePoint;

@NeedsDocumentation
public abstract class AbstractRenderContext implements IRenderContext {

    protected final String name;
    protected final ISurfaceModule<?> module;
    protected final SurfacePoint vpSize;

    public AbstractRenderContext(ISurfaceModule<?> module, String name) {
        this.module = module;
        this.name = name;

        this.vpSize = new SurfacePoint();
    }

    public void setVpSize(float x, float y) {
        this.vpSize.x = x;
        this.vpSize.y = y;
    }

    @Override
    public SurfacePoint getVPSize() {
        return vpSize;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ISurfaceModule<?> getParentModule() {
        return module;
    }
}
