package day8.even_odd;

public class ProducerConsumer {
    public static void main(String[] args) {

        EvenOdd evenOdd = new EvenOdd();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        if (i % 2 == 0) {
                            evenOdd.enqueue("Even: " + i);
                            Thread.sleep(500);
                        }
                        else {
                            evenOdd.enqueue("Odd: " + i);
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    evenOdd.dequeue();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        producer.setName("Producer");
        consumer.setName("Consumer");
        producer.start();
        consumer.start();
    }
}
