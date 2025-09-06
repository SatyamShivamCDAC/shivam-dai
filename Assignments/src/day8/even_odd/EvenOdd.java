package day8.even_odd;

import java.util.ArrayDeque;
import java.util.Queue;

public class EvenOdd {
    private Queue<String> numbers;
    boolean hasValue;

    public EvenOdd() {
        numbers = new ArrayDeque<>();
    }

    public synchronized void enqueue(String value) {
        if (hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        numbers.add(value);
        notifyAll();
        hasValue = true;
        //System.out.println(Thread.currentThread().getName() + " Enqueued: " + value);
    }

    public synchronized void dequeue() {
        if (!hasValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //System.out.println(Thread.currentThread().getName() + " Dequeued: " + numbers.poll());
        System.out.println(numbers.poll());
        notifyAll();
        hasValue = false;
    }
}
