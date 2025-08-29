package day4.bank;

public class Savings extends Account {
    public Savings(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public boolean deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount value should be a positive integer.");
        }
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) throws InvalidAmountException, MinimumBalanceException, InsufficientBalanceException {
        if (amount <= 0)
            throw new InvalidAmountException("Amount valid should be a positive integer.");
        if (super.getBalance() - amount >= 10000) {
            super.setBalance(super.getBalance() - amount);
            return true;
        }
        else if (super.getBalance() - amount >= 500) {
            super.setBalance(super.getBalance() - amount - 500);
            throw new MinimumBalanceException("Minimum balance should be 10,000.");
        }
        else
            throw new InsufficientBalanceException("Insufficient Balance");
    }
}
