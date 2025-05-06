package dev.puzzleshq.surface.api.rendering.context;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.util.SurfacePoint;

import java.awt.*;

@NeedsDocumentation
public interface IRenderContext {

    String getName();
    SurfacePoint getVPSize();
    ISurfaceModule<?> getParentModule();

    void clearScreenWithColor(Color backgroundColor);
}
