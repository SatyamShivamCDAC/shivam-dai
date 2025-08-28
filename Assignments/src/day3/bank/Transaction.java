package day3.bank;

public class Transaction {
    public void makeTransaction(Account account1, Account account2, int amount) {
        if (account1.withdraw(amount)) {
            if (account2.deposit(amount))
                System.out.println("Transaction Success");
            else {
                account1.deposit(amount);
                System.out.println("Transaction Failed");
            }
        }
        else
            System.out.println("Transaction Failed");
    }
}