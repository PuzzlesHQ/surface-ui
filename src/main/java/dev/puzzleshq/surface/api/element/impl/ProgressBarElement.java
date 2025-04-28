package dev.puzzleshq.surface.api.element.impl;

import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.screens.ISurface;

public class ProgressBarElement extends AbstractElement {

    ProgressBarStyle style;

    protected float progress;

    protected int max;
    protected float step;

    public ProgressBarElement(final ProgressBarStyle style) {
        this.style = style;

        this.width = 500;
        this.height = 30;

        this.progress = 0;
        this.max = 100;

        this.calculateStep();
    }

    private void calculateStep() {
        this.step = (100f / (this.max * ((float) this.max / this.width)) * /* scale */ (this.max / 100f));
    }

    public void setProgress(final float progress) {
        if (progress > max)
            this.progress = max;
        else
            this.progress = progress;
    }

    public void setMax(final int max) {
        this.max = max;
        this.calculateStep();
    }

    @Override
    public int getTotalWidth() {
        return this.width + 4;
    }

    @Override
    public int getTotalHeight() {
        return this.height + 4;
    }

    public static float getRealX(final int width, final ProgressBarElement element) {
        switch (element.anchorX) {
            case NONE:
                return element.x;
            case RIGHT:
                return element.x + (width * .5f) - (element.width + 4);
            case LEFT:
                return element.x - (width * .5f);
            case CENTER:
                return element.x - (element.width * .5f);
            default:
                throw new IllegalArgumentException();
        }
    }

    public ProgressBarStyle getStyle() {
        return style;
    }

    public int getMax() {
        return max;
    }

    public float getProgress() {
        return progress;
    }

    public boolean isFull() {
        return progress == max || max < 1;
    }

    public float getStep() {
        return step;
    }

}
