package concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    // Non-atomic variable called count
    // because this variable is not atomic,
    // it is possible for threads to interfere with each other and produce an incorrect result
//    private static int count = 0;

    // We say that an operation is atomic if, while it is being performed
    // another thread cannot read or change the values of the variables being changed
    // something similar to synchronized (which applies to methods and blocks only) but for variables
    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Runnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);

        Runnable myRunnable2 = new MyRunnable();
        Thread t2 = new Thread(myRunnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + count);
    }

    static class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
           // count++;
            count.incrementAndGet();  // highest
//            count.decrementAndGet();   // lowest
        }

    }

    }
}