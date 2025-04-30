package dev.puzzleshq.surface.awt.rendering.context;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;

/* Note: this is here for things that dont have a viewport */
@NeedsDocumentation
public final class ScreenBounds {

    private int x, y, width, height;

    public ScreenBounds() {}

    public ScreenBounds(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void set(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height;
    }
}
