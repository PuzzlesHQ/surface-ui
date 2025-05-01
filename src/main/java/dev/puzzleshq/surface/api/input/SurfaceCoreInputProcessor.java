package dev.puzzleshq.surface.api.input;

public class SurfaceCoreInputProcessor {

    private static ISurfaceInputProcessor CURRENT_PROCESSOR;
    public static ISurfaceInputProcessor SECONDARY_INPUT_PROCESSOR = new SurfaceInputMultiplexer();

    public static ISurfaceInputProcessor getProcessor() {
        return CURRENT_PROCESSOR;
    }

    public static void setProcessor(ISurfaceInputProcessor inputProcessor) {
        CURRENT_PROCESSOR = inputProcessor;
    }

    public static void onScroll(long window, double xOffset, double yOffset) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onScroll(window, xOffset, yOffset);
        SECONDARY_INPUT_PROCESSOR.onScroll(window, xOffset, yOffset);
    }

    public static void onCursorEnter(long window, boolean entered) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onCursorEnter(window, entered);
        SECONDARY_INPUT_PROCESSOR.onCursorEnter(window, entered);
    }

    public static void onKeyPress(long window, int key, int scancode, int action, int mods) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onKeyPress(window, key, scancode, action, mods);
        SECONDARY_INPUT_PROCESSOR.onKeyPress(window, key, scancode, action, mods);
    }

    public static void onCharTyped(long window, int codepoint) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onCharTyped(window, codepoint);
        SECONDARY_INPUT_PROCESSOR.onCharTyped(window, codepoint);
    }

    public static void onFileDropped(long window, int count, long names) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onFileDropped(window, count, names);
        SECONDARY_INPUT_PROCESSOR.onFileDropped(window, count, names);
    }

    public static void onMouseClick(long window, int button, int action, int mods) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onMouseClick(window, button, action, mods);
        SECONDARY_INPUT_PROCESSOR.onMouseClick(window, button, action, mods);
    }

    public static void onCursorMove(long window, double x, double y) {
        if (CURRENT_PROCESSOR != null)
            CURRENT_PROCESSOR.onCursorMove(window, x, y);
        SECONDARY_INPUT_PROCESSOR.onCursorMove(window, x, y);
    }

}
