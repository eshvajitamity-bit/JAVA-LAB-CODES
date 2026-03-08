//Q55. Write a Java program to demonstrate thread priorities.

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1 is running with priority: " + Thread.currentThread().getPriority());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2 is running with priority: " + Thread.currentThread().getPriority());
                }
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY); // Set thread1 to minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Set thread2 to maximum priority

        thread1.start();
        thread2.start();
    }
}
