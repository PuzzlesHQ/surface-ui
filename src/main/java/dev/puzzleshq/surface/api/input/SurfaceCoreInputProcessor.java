package dev.puzzleshq.surface.api.input;

public class SurfaceCoreInputProcessor {

    public static ISurfaceInputProcessor INTERNAL_GENERIC_PROCESSOR;
    private static IProcessor CURRENT_PROCESSOR;
    public static ISurfaceInputProcessor INTERNAL_GDX_PROCESSOR_INPUT;

    public static IProcessor getProcessor() {
        return CURRENT_PROCESSOR;
    }

    public static void setProcessor(IProcessor inputProcessor) {
        CURRENT_PROCESSOR = inputProcessor;
    }

    public static void onScroll(long window, double xOffset, double yOffset) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onScroll(window, xOffset, yOffset);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onScroll(window, xOffset, yOffset);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onScroll(window, xOffset, yOffset);
    }

    public static void onCursorEnter(long window, boolean entered) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onCursorEnter(window, entered);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onCursorEnter(window, entered);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onCursorEnter(window, entered);
    }

    public static void onKeyPress(long window, int key, int scancode, int action, int mods) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onKeyPress(window, key, scancode, action, mods);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onKeyPress(window, key, scancode, action, mods);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onKeyPress(window, key, scancode, action, mods);
    }

    public static void onCharTyped(long window, int codepoint) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onCharTyped(window, codepoint);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onCharTyped(window, codepoint);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onCharTyped(window, codepoint);
    }

    public static void onFileDropped(long window, int count, long names) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onFileDropped(window, count, names);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onFileDropped(window, count, names);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onFileDropped(window, count, names);
    }

    public static void onMouseClick(long window, int button, int action, int mods) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onMouseClick(window, button, action, mods);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onMouseClick(window, button, action, mods);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onMouseClick(window, button, action, mods);
    }

    public static void onCursorMove(long window, double x, double y) {
        if (CURRENT_PROCESSOR instanceof ISurfaceInputProcessor processor)
            processor.onCursorMove(window, x, y);
        if (INTERNAL_GDX_PROCESSOR_INPUT != null)
            INTERNAL_GDX_PROCESSOR_INPUT.onCursorMove(window, x, y);
        if (INTERNAL_GENERIC_PROCESSOR != null)
            INTERNAL_GENERIC_PROCESSOR.onCursorMove(window, x, y);
    }

}
