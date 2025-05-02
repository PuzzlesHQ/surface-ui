package dev.puzzleshq.surface.cereal.js;

import java.util.logging.Logger;

@JsIncluded
public class JSConsole {

    public static final JSConsole INSTANCE = new JSConsole();
    private static final Logger logger = Logger.getLogger("Javascript Console");

    public void log(Object... objects) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            Object o = objects[i];
            if (i + 1 != objects.length) {
                builder.append(o);
            } else {
                builder.append(o + " ");
            }
        }

        System.out.println(builder.toString());
    }

    public void warn(Object... objects) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            Object o = objects[i];
            if (i + 1 != objects.length) {
                builder.append(o);
            } else {
                builder.append(o + " ");
            }
        }

        System.out.println("\033[0;33m" + builder + "\033[0m");
    }

    public void error(Object... objects) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < objects.length; i++) {
            Object o = objects[i];
            if (i + 1 != objects.length) {
                builder.append(o);
            } else {
                builder.append(o + " ");
            }
        }

        System.out.println("\033[0;31m" + builder + "\033[0m");
    }

}
