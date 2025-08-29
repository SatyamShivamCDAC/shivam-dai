package day4.bank;

public class Main {
    public static void main(String[] args) {

        Savings shivam = new Savings(101, "Shivam", 75000);

        System.out.println(shivam);
//        try {
//            shivam.deposit(-50);
//        }
//        catch (InvalidAmountException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            shivam.withdraw(76000);
//        }
//        catch (InvalidAmountException | MinimumBalanceException | InsufficientBalanceException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(shivam);

        Current satyam = new Current(101, "Satyam", 100000);
//        System.out.println(satyam);
//        try {
//            satyam.deposit(20);
//        }
//        catch (InvalidAmountException | MinDenominationException e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println(satyam);

        try {
            satyam.withdraw(75);
        }
        catch (InvalidAmountException |  InsufficientBalanceException | MaxWithdrawAmountException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(satyam);

    }
}
