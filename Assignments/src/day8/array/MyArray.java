package day8.array;

public class MyArray {
    private int[] array;

    public MyArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public synchronized void printArray() {
        System.out.print(Thread.currentThread().getName() + ": ");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
