package dev.puzzleshq.surface.util;

public class MathUtils {
    public static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float lerp (float fromValue, float toValue, float progress) {
        return fromValue + (toValue - fromValue) * progress;
    }

    public static double lerp(double fromValue, double toValue, double progress) {
        return fromValue + (toValue - fromValue) * progress;
    }

}
