package dev.puzzleshq.surface.gdx;

import com.badlogic.gdx.graphics.g2d.Batch;

import java.awt.*;

public class GDXUtil {

    public static Color toAwtColor(com.badlogic.gdx.graphics.Color color) {
        return new Color(color.r * 255, color.g * 255, color.b * 255, color.a * 255);
    }

    public static com.badlogic.gdx.graphics.Color toGdxColor(Color color) {
        return new com.badlogic.gdx.graphics.Color(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);
    }

    public static void setColor(Batch batch, Color color) {
        batch.setColor(color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, color.getAlpha() / 255f);
    }

}
