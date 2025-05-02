package dev.puzzleshq.surface;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

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

    @Override
    public void run() {
        while (!SurfaceUpdateSupervisor.RUNNABLE_QUEUE.isEmpty()) {
            Runnable runnable = SurfaceUpdateSupervisor.RUNNABLE_QUEUE.poll();
            runnable.run();
        }
    }
}
