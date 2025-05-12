package dev.puzzleshq.surface.api.element;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.module.ISurfaceModule;
import dev.puzzleshq.surface.api.rendering.AnchorX;
import dev.puzzleshq.surface.api.rendering.AnchorY;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;

@NeedsDocumentation
public interface IElement {

    void update(final ISurface surface, final float delta);

    void setZIndex(int index);
    int getZIndex();

    void setVisibility(final boolean visibility);
    boolean isVisible();

    void setPosition(final int x, final int y);
    void setX(final int x);
    void setY(final int y);

    int getX();
    int getY();

    void setSize(final int width, final int height);
    void setWidth(int width);
    void setHeight(int height);

    int getWidth();
    int getHeight();

    void setAnchors(final AnchorX xAnchor, final AnchorY yAnchor);
    void setAnchorX(final AnchorX xAnchor);
    void setAnchorY(final AnchorY yAnchor);

    AnchorX getAnchorX();
    AnchorY getAnchorY();

    IElementRenderer<?, ? extends IElement> getRenderer(ISurfaceModule<?> module);

}
