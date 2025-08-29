package day4.bank;

public class Current extends Account {
    public Current(int accountNumber, String name, int balance) {
        super(accountNumber, name, balance);
    }

    public boolean deposit(int amount) throws InvalidAmountException, MinDenominationException {
        if (amount <= 0)
            throw new InvalidAmountException("Amount valid should be a positive integer.");
        else if (amount <= 50)
            throw new MinDenominationException("Minimum denomination should be greater than 50.");
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(int amount) throws InvalidAmountException, MaxWithdrawAmountException, InsufficientBalanceException {
        if (amount <= 0)
            throw new InvalidAmountException("Amount valid should be a positive integer.");
        else if (super.getBalance() < amount)
            throw new InsufficientBalanceException("Insufficient Balance");
        else if (amount > 50000)
            throw new MaxWithdrawAmountException("You can withdraw maximum 50,000 at a time.");
        super.setBalance(super.getBalance() - amount);
        return true;
    }
}
