package dev.puzzleshq.surface.cereal.io;

import dev.puzzleshq.surface.api.element.IElement;
import dev.puzzleshq.surface.api.input.IProcessor;
import dev.puzzleshq.surface.api.input.SurfaceCoreInputProcessor;
import dev.puzzleshq.surface.api.rendering.context.IRenderContext;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.AbstractSurfaceGeneric;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.cereal.CerealSupervisor;
import dev.puzzleshq.surface.cereal.js.JSConsole;
import dev.puzzleshq.surface.cereal.js.Java;
import dev.puzzleshq.surface.cereal.js.SurfaceManager;
import org.mozilla.javascript.*;

import java.awt.*;
import java.io.IOException;
import java.io.StringReader;

public class ScriptedSurface extends AbstractSurfaceGeneric<IRenderContext> {

    Context surfaceContext;

    Scriptable scope;

    String scriptName = null;
    String scriptText = null;

    Color backgroundColor = null;

    public ScriptedSurface() {
        super();
        super.init();
    }

    public void setScript(String scriptName, String scriptText) {
        this.scriptName = scriptName;
        this.scriptText = scriptText;
    }

    Object onRender;
    Object onUpdate;

    @Override
    public void init() {

        if (scriptText != null && scriptName != null) {
            surfaceContext = CerealSupervisor.createContext();
            scope = surfaceContext.initSafeStandardObjects();

            ScriptableObject.putProperty(scope, "Java", Context.javaToJS(Java.INSTANCE, scope, surfaceContext));
            ScriptableObject.putProperty(scope, "SurfaceManager", Context.javaToJS(SurfaceManager.INSTANCE, scope, surfaceContext));
            ScriptableObject.putProperty(scope, "console", Context.javaToJS(JSConsole.INSTANCE, scope, surfaceContext));

            try {
                Script script = surfaceContext.compileReader(new StringReader(scriptText), scriptName, 0, null);
                script.exec(surfaceContext, scope);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Object initFunction = scope.get("init", scope);
            if (initFunction instanceof Function) {
                Context.call(ContextFactory.getGlobal(), (Function) initFunction, scope, scope, new Object[]{ this });
            }

            this.onRender = scope.get("onRender", scope);
            this.onUpdate = scope.get("onUpdate", scope);
        }
    }

    @Override
    public void render() {
        if (backgroundColor != null)
            context.clearScreenWithColor(backgroundColor);
        if (this.onRender != null && this.onRender instanceof Function && this.scope != null) {
            Context.call(ContextFactory.getGlobal(), (Function) this.onRender, scope, scope, new Object[]{ context });
//            ((Function) this.onRender).call(surfaceContext, scope, scope, new Object[]{ context });
        }
        for (IElement element : getElementCollection()) {
            ((IElementRenderer)context.getParentModule().getElementRenderer(element.getClass())).render(
                    this,
                    context,
                    element
            );
        }
    }

    @Override
    public void update(float delta) {
        if (this.onUpdate != null && this.onUpdate instanceof Function && scope != null) {
            Context.call(ContextFactory.getGlobal(), (Function) this.onUpdate, scope, scope, new Object[]{ delta });
        }
        super.update(delta);
    }

    @Override
    public void preSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {
        super.preSwitchedTo(currentSurface, oldSurface);

        if (scope != null) {
            Object initFunction = scope.get("preSwitchedTo", scope);
            if (initFunction instanceof Function) {
                Context.call(ContextFactory.getGlobal(), (Function) initFunction, scope, scope, new Object[]{ currentSurface, oldSurface });
            }
        }
    }

    @Override
    public void preSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {
        super.preSwitchSurface(currentSurface, newSurface);

        if (scope != null) {
            Object initFunction = scope.get("preSwitchSurface", scope);
            if (initFunction instanceof Function) {
                Context.call(ContextFactory.getGlobal(), (Function) initFunction, scope, scope, new Object[]{ currentSurface, newSurface });
            }
        }
    }

    @Override
    public void postSwitchedTo(ISurface<?> currentSurface, ISurface<?> oldSurface) {
        super.postSwitchedTo(currentSurface, oldSurface);

        if (currentSurface instanceof IProcessor processor)
            SurfaceCoreInputProcessor.setProcessor(processor);

        if (scope != null) {
            Object initFunction = scope.get("postSwitchedTo", scope);
            if (initFunction instanceof Function) {
                Context.call(ContextFactory.getGlobal(), (Function) initFunction, scope, scope, new Object[]{ currentSurface, oldSurface });
            }
        }
    }

    @Override
    public void postSwitchSurface(ISurface<?> currentSurface, ISurface<?> newSurface) {
        super.postSwitchSurface(currentSurface, newSurface);

        if (scope != null) {
            Object initFunction = scope.get("preSwitchSurface", scope);
            if (initFunction instanceof Function) {
                Context.call(ContextFactory.getGlobal(), (Function) initFunction, scope, scope, new Object[]{ currentSurface, newSurface });
            }
        }
    }

}
