package dev.puzzleshq.surface.api.element.impl;

import dev.puzzlehq.annotation.documentation.NeedsDocumentation;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.api.screens.ISurface;

@NeedsDocumentation
public class ProgressBarElement extends AbstractElement {

    ProgressBarStyle style;

    protected float progress;

    protected int max;
    protected float step;

    public ProgressBarElement(final ProgressBarStyle style) {
        this.style = style;

        this.width = 500;
        this.height = 30;

        this.progress = 75;
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
    public float getTotalWidth() {
        return this.width + 2 * this.style.outlineThickness;
    }

    @Override
    public float getTotalHeight() {
        return this.height + 2 * this.style.outlineThickness;
    }

    public ProgressBarStyle getStyle() {
        return style;
    }

    public void setStyle(ProgressBarStyle style) {
        this.style = style;
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
