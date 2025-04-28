package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzleshq.surface.api.module.ISurfaceModule;

public interface IRenderContext {

    String getName();
    ISurfaceModule<?> getParentModule();

}
