package day3.bank;

public class Current extends Account {
    public Current(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    public boolean deposit(int amount) {
        if (amount <= 50)
            return false;
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if (super.getBalance() < amount || amount > 50000)
            return false;
        super.setBalance(super.getBalance() - amount);
        return true;
    }
}
