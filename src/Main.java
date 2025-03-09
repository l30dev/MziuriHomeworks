import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class Main {

    static class HelloWorldRunnable implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello World");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class CounterRunnableIncrement implements Runnable {
        private final Counter counter;

        public CounterRunnableIncrement(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }

    static class SecretCodeRunnable implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.println("Generated secret code...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1, 2, 3, or 4) to choose an example:");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                Thread helloWorldThread = new Thread(new HelloWorldRunnable());
                helloWorldThread.start();
                break;
            case 2:
                Thread counterThread = new Thread(new CounterRunnable());
                counterThread.start();
                break;
            case 3:
                Counter counter = new Counter();
                Runnable task = new CounterRunnableIncrement(counter);
                Thread thread1 = new Thread(task);
                Thread thread2 = new Thread(task);
                thread1.start();
                thread2.start();
                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Final count: " + counter.getCount());
                break;
            case 4:
                long startTime = System.currentTimeMillis();
                long endTime = startTime + 3000;
                int counterGenerated = 0;
                ExecutorService executor = Executors.newFixedThreadPool(100);
                while (System.currentTimeMillis() < endTime && counterGenerated < 100) {
                    executor.submit(new SecretCodeRunnable());
                    counterGenerated++;
                }
                executor.shutdown();
                System.out.println("Generated secret code " + counterGenerated + " times within 3 seconds.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}