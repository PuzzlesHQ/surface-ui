package test.gdx;

import dev.puzzleshq.surface.api.screens.AbstractSurfaceGeneric;
import test.SurfaceSetup;

public class GameBootingScreenGDX extends AbstractSurfaceGeneric {

    public GameBootingScreenGDX() {}

    @Override
    public void init() {
        super.init();

        SurfaceSetup.setup(this);
    }
}
