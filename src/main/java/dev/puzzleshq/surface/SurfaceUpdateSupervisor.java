package dev.puzzleshq.surface;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class SurfaceUpdateSupervisor implements Runnable {

    public static final Thread EVENT_THREAD;
    public static final Queue<Runnable> RUNNABLE_QUEUE;

    public static long window;

    static {
        RUNNABLE_QUEUE = new ConcurrentLinkedQueue<>();

        EVENT_THREAD = new Thread(new SurfaceUpdateSupervisor(), "SURFACE-UPDATE-THREAD");
        EVENT_THREAD.setDaemon(true);
    }

    public SurfaceUpdateSupervisor() {
    }

    public static void start() {
        EVENT_THREAD.start();
    }
    private static float delta;

    @Override
    public void run() {
        while (true) {
            if (SurfaceSupervisor.getCurrentSurface() == null) continue;
            long start = System.nanoTime();
            SurfaceSupervisor.getCurrentSurface().update(delta);

//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            delta = (float) ((System.nanoTime() - start) * 1e-9);
        }
//        while (!SurfaceUpdateSupervisor.RUNNABLE_QUEUE.isEmpty()) {
//            Runnable runnable = SurfaceUpdateSupervisor.RUNNABLE_QUEUE.poll();
//            runnable.run();
//        }
    }
}
