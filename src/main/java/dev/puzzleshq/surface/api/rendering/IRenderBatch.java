package dev.puzzleshq.surface.api.rendering;

public interface IRenderBatch {

    void setColor(int r, int g, int b);
    void rect(int x, int y, int width, int height);
    void image(Object image, int x, int y, int width, int height, int rotate, int scale);

}
