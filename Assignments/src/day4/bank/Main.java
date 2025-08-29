package day4.bank;

public class Main {
    public static void main(String[] args) {

        Savings shivam = new Savings(101, "Shivam", 50000);
        System.out.println(shivam);

        try {
            shivam.deposit(-50);
        }
        catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            shivam.withdraw(76000);
        }
        catch (InvalidAmountException | MinimumBalanceException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(shivam);

        Current satyam = new Current(101, "Satyam", 100000);
        System.out.println(satyam);

        try {
            satyam.deposit(20);
        }
        catch (InvalidAmountException | MinDenominationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nTransactions:");

        Transaction transaction = new Transaction();


        try {
            transaction.makeTransaction(shivam, satyam, -500);
        }
        catch (InvalidAmountException | InsufficientBalanceException | MinimumBalanceException | MinDenominationException | MaxWithdrawAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            transaction.makeTransaction(shivam, satyam, 51000);
        }
        catch (InvalidAmountException | InsufficientBalanceException | MinimumBalanceException | MinDenominationException | MaxWithdrawAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            transaction.makeTransaction(shivam, satyam, 49);
        }
        catch (InvalidAmountException | InsufficientBalanceException | MinimumBalanceException | MinDenominationException | MaxWithdrawAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            transaction.makeTransaction(shivam, satyam, 49500);
        }
        catch (InvalidAmountException | InsufficientBalanceException | MinimumBalanceException | MinDenominationException | MaxWithdrawAmountException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Shivam Balance: " + shivam.getBalance());
        System.out.println("Satyam Balance: " + satyam.getBalance());

    }
}
