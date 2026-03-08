//Q58. Write a Java program to demonstrate synchronised block and interrupt() method.

class SharedResource {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedBlockAndInterruptExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    resource.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    resource.increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500); // Let the threads run for a while
            thread1.interrupt(); // Interrupt thread1
        } catch (InterruptedException e) {
            e.printStackTrace();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + resource.getCount());
    }
}
