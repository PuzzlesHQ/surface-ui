package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzleshq.surface.api.module.ISurfaceModule;

public class AbstractRenderContext implements IRenderContext {

    protected final String name;
    protected final ISurfaceModule<?> module;

    public AbstractRenderContext(ISurfaceModule<?> module, String name) {
        this.module = module;
        this.name = name;
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
