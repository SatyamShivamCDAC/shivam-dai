package day8.bank;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        notifyAll();
    }
}