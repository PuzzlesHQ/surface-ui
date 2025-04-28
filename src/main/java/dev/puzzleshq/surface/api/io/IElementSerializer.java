package dev.puzzleshq.surface.api.io;

import dev.puzzleshq.surface.api.element.IElement;

public interface IElementSerializer<T extends IElement> {

    byte[] serialize(IElement element);
    IElement deserialize();

}
