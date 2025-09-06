package day8.array;

public class MyArray {
    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public synchronized void printArray() {
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int i : array) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
