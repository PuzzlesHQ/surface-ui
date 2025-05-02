package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.module.ISurfaceModule;

@NeedsDocumentation
public abstract class AbstractRenderContext implements IRenderContext {

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
