package test;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class EventExecutor implements Runnable {

    public static final Thread EVENT_THREAD;
    public static final Queue<Runnable> RUNNABLE_QUEUE;

    public static long window;

    static {
        RUNNABLE_QUEUE = new ConcurrentLinkedQueue<>();

        EVENT_THREAD = new Thread(new EventExecutor(), "EVENT-THREAD");
        EVENT_THREAD.setDaemon(true);
    }

    public EventExecutor() {
    }

    public static void start() {
        EVENT_THREAD.start();
    }

    @Override
    public void run() {
        while (!EventExecutor.RUNNABLE_QUEUE.isEmpty()) {
            Runnable runnable = EventExecutor.RUNNABLE_QUEUE.poll();
            runnable.run();
        }
    }
}
