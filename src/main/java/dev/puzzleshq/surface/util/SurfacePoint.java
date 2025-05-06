package dev.puzzleshq.surface.util;

public class SurfacePoint {
    public float x;
    public float y;

    public SurfacePoint() {}

    public SurfacePoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "( " + x + ", " + y + " )";
    }
}
