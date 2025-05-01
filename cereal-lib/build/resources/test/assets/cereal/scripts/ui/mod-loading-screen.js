function init(surface) {
    Sysout.println("Hi " + surface);
}

// On Switch To
function preSwitchedTo(currentSurface, oldSurface) {
    Sysout.println(`Pre - Switching Surfaces from ${oldSurface} to ${currentSurface}`);
}

function postSwitchedTo(currentSurface, oldSurface) {
    Sysout.println(`Post - Switching Surfaces from ${oldSurface} to ${currentSurface}`);

//    const runtime = Java.getRuntime();
//    const ramRange = (runtime.maxMemory() / (1024 * 1024));
//    const ramIncrement = 255 / ramRange;
//
//    const ramUsageBar = currentSurface.get("ram-usage-bar");
//    ramUsageBar.setMax(ramRange);
}

// On Switch Away
function preSwitchSurface(currentSurface, newSurface) {
    Sysout.println(`Pre - Switching away Surfaces from ${currentSurface} to ${newSurface}`);
}

function postSwitchSurface(currentSurface, newSurface) {
    Sysout.println(`Post - Switching away Surfaces from ${currentSurface} to ${newSurface}`);

}