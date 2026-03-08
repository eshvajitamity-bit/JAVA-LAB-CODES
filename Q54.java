//Q54. Write a Java program to demonstrate the use of join() method in threads.

public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1 is running");
                    try {
                        Thread.sleep(1000); // Sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join(); // Wait for thread1 to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is running after Thread 1 has finished");
            }
        });

        thread1.start();
        thread2.start();
    }
}
