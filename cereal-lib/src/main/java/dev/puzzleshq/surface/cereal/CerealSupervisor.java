package dev.puzzleshq.surface.cereal;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.element.impl.ProgressBarElement;
import dev.puzzleshq.surface.api.element.styles.ProgressBarStyle;
import dev.puzzleshq.surface.cereal.js.hidden.ClassFinder;
import org.mozilla.javascript.Context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class CerealSupervisor {

    private static final Map<String, Supplier<? extends IElement>> elementSupplierMap;

    public static Context createContext() {
        Context ctx = Context.enter();
        ctx.setClassShutter(new ClassFinder());
        return ctx;
    }

    static {
        elementSupplierMap = new ConcurrentHashMap<>();
        CerealSupervisor.init();
    }

    private static void init() {
        CerealSupervisor.register("cereal:progress-bar", () -> new ProgressBarElement(ProgressBarStyle.DEFAULT));
    }

    public static void register(String id, Supplier<? extends IElement> elementSupplier) {
        CerealSupervisor.elementSupplierMap.put(id, elementSupplier);
    }

    public static Supplier<? extends IElement> getElementSupplier(String id) {
        return CerealSupervisor.elementSupplierMap.get(id);
    }

    public static IElement getElement(String id) {
        return CerealSupervisor.elementSupplierMap.get(id).get();
    }

}
