package day3.bank;

public class Main {
    public static void main(String[] args) {

//        Savings shivam = new Savings(101, "Shivam", 75000);
//        System.out.println(shivam);
//        shivam.withdraw(65000);
//        shivam.withdraw(7000);
//        shivam.withdraw(2000);
//
//        shivam.deposit(1500);
//
//        Current satyam = new Current(102, "Satyam", 150000);
//        System.out.println(satyam);
//        satyam.withdraw(50000);
//        satyam.withdraw(70000);
//        satyam.deposit(20);
//        satyam.deposit(20000);

        Savings shivam = new Savings(101, "Shivam", 50000);
        Current satyam = new Current(102, "Satyam", 150000);

        Transaction transaction = new Transaction();
        transaction.makeTransaction(satyam, shivam, 50000);

        System.out.println(shivam);
        System.out.println(satyam);
    }
}
