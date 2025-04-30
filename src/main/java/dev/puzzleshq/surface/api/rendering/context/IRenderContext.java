package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.module.ISurfaceModule;

@NeedsDocumentation
public interface IRenderContext {

    String getName();
    ISurfaceModule<?> getParentModule();

}
