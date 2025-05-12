package dev.puzzleshq.surface.api.element.styles;

import java.awt.*;

public class TabbedSliderBarStyle {


    public final Color full;
    public final Color empty;
    public final Color outline;

    public final Color tabOutline;
    public final Color tabBackground;

    public final Color fullHover;
    public final Color emptyHover;
    public final Color outlineHover;

    public final Color tabOutlineHover;
    public final Color tabBackgroundHover;
    public float tabOutlineSize;
    public float sliderOutlineSize;

    public TabbedSliderBarStyle(
            Color full,
            Color empty,
            Color outline,

            Color tabOutline,
            Color tabBackground,

            Color fullHover,
            Color emptyHover,
            Color outlineHover,

            Color tabOutlineHover,
            Color tabBackgroundHover,

            float tabOutlineSize,
            float sliderOutlineSize
    ) {
        this.full = full;
        this.empty = empty;
        this.outline = outline;

        this.tabOutline = tabOutline;
        this.tabBackground = tabBackground;

        this.fullHover = fullHover;
        this.emptyHover = emptyHover;
        this.outlineHover = outlineHover;

        this.tabOutlineHover = tabOutlineHover;
        this.tabBackgroundHover = tabBackgroundHover;

        this.tabOutlineSize = tabOutlineSize;
        this.sliderOutlineSize = sliderOutlineSize;
    }

    public static final TabbedSliderBarStyle DEFAULT = new TabbedSliderBarStyle(
            Color.BLACK,
            Color.BLACK,
            Color.DARK_GRAY,

            Color.WHITE,
            Color.BLACK,

            Color.BLACK,
            Color.BLACK,
            Color.WHITE,

            Color.WHITE,
            Color.BLACK,
            2,
            2
    );

}
