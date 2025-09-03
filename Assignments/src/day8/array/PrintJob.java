package day8.array;

public class PrintJob implements Runnable {
    MyArray array;

    public PrintJob() {
        array = new MyArray(new int[]{1, 2, 3, 4, 5});
    }

    @Override
    public void run() {
        array.printArray();
    }
}
