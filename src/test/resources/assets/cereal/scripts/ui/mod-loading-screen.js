function init(surface) {
    Sysout.println("Hi " + surface);

    const runtime = Java.getRuntime();
    const ramRange = (runtime.getMaxMemory() / (1024 * 1024));
    const ramIncrement = 255 / ramRange;

    const ramUsageBar = surface.getElement("ram-usage-bar");
    ramUsageBar.setMax(ramRange);
}

function onRender(ctx) {
    const ramUsageBar = thisSurface.getElement("ram-usage-bar");
    ctx.prog = ctx.prog + 1;
    ramUsageBar.setProgress(ctx.prog);
    Sysout.println("Look mum, Im rendering. " + ctx.prog);
}

// On Switch To
function preSwitchedTo(currentSurface, oldSurface) {
    Sysout.println(`Pre - Switching Surfaces from ${oldSurface} to ${currentSurface}`);
}

function postSwitchedTo(currentSurface, oldSurface) {
    Sysout.println(`Post - Switching Surfaces from ${oldSurface} to ${currentSurface}`);
}

// On Switch Away
function preSwitchSurface(currentSurface, newSurface) {
    Sysout.println(`Pre - Switching away Surfaces from ${currentSurface} to ${newSurface}`);
}

function postSwitchSurface(currentSurface, newSurface) {
    Sysout.println(`Post - Switching away Surfaces from ${currentSurface} to ${newSurface}`);

}