package dev.puzzleshq.surface.cereal.js;

import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.cereal.io.ScriptedSurface;
import org.mozilla.javascript.ArrowFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Function;

import java.util.function.Consumer;

@JsIncluded
public class Java {

    Runtime runtime = new Runtime();

    public static final Java INSTANCE = new Java();

    public Runtime getRuntime() {
        return runtime;
    }

    public ISurface getSurface(String id) {
        return SurfaceSupervisor.getSurface(id);
    }

    @JsIncluded
    public static class Runtime {

        private java.lang.Runtime runtime = java.lang.Runtime.getRuntime();

        public long getMaxMemory() {
            return runtime.maxMemory();
        }

        public long getFreeMemory() {
            return runtime.freeMemory();
        }

        public long getTotalMemory() {
            return runtime.totalMemory();
        }

    }

}
