package day8.bank;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Enter valid withdrawal amount.");
            return;
        }

        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting " + amount + " " + balance);
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        balance -= amount;
    }

    public synchronized void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Enter valid deposit amount.");
            return;
        }

        while (balance > amount) {
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting " + amount + " " + balance);
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
