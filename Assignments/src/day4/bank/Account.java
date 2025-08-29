package day4.bank;

public abstract class Account {
    private int accountNumber;
    private String name;
    private int balance;

    public Account(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public abstract boolean withdraw(int amount) throws InvalidAmountException, MinimumBalanceException, InsufficientBalanceException, MaxWithdrawAmountException;
    public abstract boolean deposit(int amount) throws InvalidAmountException, MinDenominationException;

    public String toString() {
        return String.format("\nAccount Number: %d\nName: %s\nBalance: %d\n", accountNumber, name, balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}