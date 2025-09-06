package day4.bank;

public class Main {
    public static void main(String[] args) {

        Savings shivam = new Savings(101, "Shivam", 50000);
        try {
            shivam.withdraw(-500);
        }
        catch (InvalidAmountException | MinimumBalanceException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            shivam.withdraw(51000);
        }
        catch (InvalidAmountException | MinimumBalanceException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            shivam.withdraw(48000);
        }
        catch (InvalidAmountException | MinimumBalanceException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        Current satyam = new Current(102, "Satyam", 150000);

        try {
            satyam.deposit(49);
        }
        catch (MinDenominationException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        try {
            satyam.withdraw(51000);
        }
        catch (MaxWithdrawAmountException | InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
