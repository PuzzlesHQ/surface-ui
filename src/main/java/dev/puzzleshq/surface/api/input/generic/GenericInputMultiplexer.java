package dev.puzzleshq.surface.api.input.generic;

import dev.puzzleshq.surface.api.input.event.keyboard.CharTypedEvent;
import dev.puzzleshq.surface.api.input.event.keyboard.KeyPressEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseClickEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseMoveEvent;
import dev.puzzleshq.surface.api.input.event.mouse.MouseScrollEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericInputMultiplexer implements IGenericInputProcessor {

    List<IGenericInputProcessor> processors;

    public GenericInputMultiplexer() {
        processors = new ArrayList<>();
    }

    public GenericInputMultiplexer(IGenericInputProcessor... processors) {
        this();

        this.processors.addAll(Arrays.asList(processors));
    }

    public void addProcessors(IGenericInputProcessor... processors) {
        this.processors.addAll(Arrays.asList(processors));
    }

    public void onScroll(MouseScrollEvent e) {
        for (IGenericInputProcessor processor : this.processors)
            processor.onScroll(e);
    }

    public void onMouseClick(MouseClickEvent e) {
        for (IGenericInputProcessor processor : this.processors)
            processor.onMouseClick(e);
    }

    public void onMouseMove(MouseMoveEvent e) {
        for (IGenericInputProcessor processor : this.processors)
            processor.onMouseMove(e);
    }

    public void onKeyPress(KeyPressEvent e) {
        for (IGenericInputProcessor processor : this.processors)
            processor.onKeyPress(e);
    }

    public void onCharTyped(CharTypedEvent e) {
        for (IGenericInputProcessor processor : this.processors)
            processor.onCharTyped(e);
    }


}
