package day8.array;

public class Main {
    public static void main(String[] args) {

        PrintJob printJob = new PrintJob();
        Thread thread1 = new Thread(printJob);
        Thread thread2 = new Thread(printJob);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();

    }
}
