package dev.puzzleshq.surface.api.io;

import dev.puzzleshq.surface.api.screens.ISurface;

public interface ISurfaceSerializer {

    byte[] serialize(ISurface surface);

}
