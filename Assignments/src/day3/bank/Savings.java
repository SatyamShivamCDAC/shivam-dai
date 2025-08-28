package day3.bank;

public class Savings extends Account {
    public Savings(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public boolean deposit(int amount) {
        if (amount <= 0)
            return false;
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if (super.getBalance() - amount >= 10000) {
            super.setBalance(super.getBalance() - amount);
            return true;
        }
        else if (super.getBalance() - amount >= 500) {
            super.setBalance(super.getBalance() - amount - 500);
            return true;
        }
        else
            return false;
    }
}
