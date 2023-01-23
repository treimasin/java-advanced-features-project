package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        // Java provides the Executor interface and the ExecutorService interface.
        // better performance for longer-lived tasks
        // NO thread reuse
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Creates a new thread pool that creates new threads as needed
        // better performance for short-lived tasks
        // thread reuse
        ExecutorService executorCached = Executors.newCachedThreadPool();

        // submit a task for execution
        executor.submit(new Runnable() {
            @Override
            public void run() {
                // code to be executed by a thread from the pool
                System.out.println("Hello from a thread:" + Thread.currentThread().getName());
            }
        });

        // shut down the executor to prevent any new tasks from being submitted
        executor.shutdown();

    }
}
