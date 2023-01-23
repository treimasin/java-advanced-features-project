package concurrency;

public class Main {
    public static void main1(String[] args) throws InterruptedException {

          System.out.println("Main thread starts: " + Thread.currentThread().getName());
//        Thread.sleep(5000);
//        System.out.println("Main thread is still running");
//        Thread.sleep(5000);
//        System.out.println("Main thread ends here.");

        StopWatchThread myStopWatch = new StopWatchThread();
        StopWatchThread myStopWatch2 = new StopWatchThread();
        StopWatchThread myStopWatch3 = new StopWatchThread();

        myStopWatch.start();
        myStopWatch2.start();
        myStopWatch3.start();

        // never call run() method of threads yourself; it won't create any thread for you
        // it will just execute the logic inside run() method and not in parallel

        // order of execution is NOT guaranteed

//        RunnableThread myRunnableThread = new RunnableThread();
//        myRunnableThread.run();

        Thread myRunnableThreadUsingThreadClass = new Thread(new RunnableThread());
        myRunnableThreadUsingThreadClass.start();



    }

    // Synchronizing a method
    class MyClass {
        public synchronized void doSomething() {
            // code to be synchronized
        }
    }

    // This causes the doSomething() method to be locked, so that only one thread can execute it at a time.
    // When a thread enters a synchronized method, it acquires the lock for the object on which the method is defined
    // This means that other threads cannot enter any synchronized methods on the same object until the owner has exited the method


    // Synchronizing a block of code
    class MyClass2 {
        private Object lock = new Object();
        public void  doSomething() {
            synchronized (lock) {
                // code to be synchronized
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new IncrementThread(counter);
        Thread t2 = new IncrementThread(counter);

        t1.start();
        t2.start();

        t1.join(); // main thread should wait for t1 to die/finish its execution
        t2.join();

        System.out.println(counter.getCount());
    }



    static class Counter {
        private int count = 0;

        // if we don't use synchronized keyword, it causes RACE condition to happen.
        // RACE CONDITION: when two or more threads try to access shared resources concurrently
        // and the outcome of the program depends on the interleaving of the threads
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }



    static class IncrementThread extends Thread {
        private Counter counter;

        public IncrementThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }

        }
    }




}
