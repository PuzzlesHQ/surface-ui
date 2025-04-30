package dev.puzzleshq.surface.cereal.js.hidden;

import org.mozilla.javascript.ClassShutter;

import java.util.ArrayList;
import java.util.List;

public class ClassFinder implements ClassShutter {

    public static final List<String> PACKAGE_ALLOW_LIST = new ArrayList<>();

    static {
        PACKAGE_ALLOW_LIST.add("dev.puzzleshq.surface.");
        PACKAGE_ALLOW_LIST.add("java.io.PrintStream");
        PACKAGE_ALLOW_LIST.add("java.lang.");
    }

    @Override
    public boolean visibleToScripts(String className) {
        if (className.startsWith("dev.puzzleshq.surface.cereal.js.hidden.")) return false;

        for (String pkg : ClassFinder.PACKAGE_ALLOW_LIST) {
            if (className.startsWith(pkg)) return true;
        }

        return false;
    }
}
