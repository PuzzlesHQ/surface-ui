var thisSurface;
var ramUsageBar;
var prog = 0;

function init(surface) {
    thisSurface = surface;

    console.log("Hi " + thisSurface);

    const runtime = Java.getRuntime();
    const ramRange = (runtime.getMaxMemory() / (1024 * 1024));
    const ramIncrement = 255 / ramRange;

    ramUsageBar = thisSurface.getElement("ram-usage-bar");
    ramUsageBar.setMax(ramRange);

    const testButton = thisSurface.getElement("button");
    if (testButton != null) {
//        testButton.setClickEvent(Java.toConsumer((btn) => {
//            testButton.getClickEvent().apply(btn);
//            Sysout.println("click");
//        }));
    }
}

function onRender(ctx) {
    prog = prog + 1;
    ramUsageBar.setProgress(prog);
    console.error("Look mum, Im rendering. " + prog);

//   if (testButton != null) {
//       testButton.setClickEvent(Java.toConsumer((btn) => {
//           testButton.getClickEvent().apply(btn);
//           Sysout.println("click");
//       }));
//   }
}

// On Switch To
function preSwitchedTo(currentSurface, oldSurface) {
    console.log(`Pre - Switching Surfaces from ${oldSurface} to ${currentSurface}`);
}

function postSwitchedTo(currentSurface, oldSurface) {
    console.log(`Post - Switching Surfaces from ${oldSurface} to ${currentSurface}`);
}

// On Switch Away
function preSwitchSurface(currentSurface, newSurface) {
    console.log(`Pre - Switching away Surfaces from ${currentSurface} to ${newSurface}`);
}

function postSwitchSurface(currentSurface, newSurface) {
    console.log(`Post - Switching away Surfaces from ${currentSurface} to ${newSurface}`);
}