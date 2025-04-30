package dev.puzzleshq.surface.cereal.js.hidden;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;

public class TimeoutContextFactory extends ContextFactory {

    @Override
    protected Context makeContext() {
        Context cx = super.makeContext();
//        cx.setInstructionObserverThreshold(1000);
        return cx;
    }

    @Override
    protected void observeInstructionCount(Context cx, int instructionCount) {
//        long startTime = (Long) cx.getThreadLocal("startTime");
//        if (System.currentTimeMillis() - startTime > 5000) {
//             Execution took too long
//            throw new Error("Script execution timeout.");
//        }
    }
}
