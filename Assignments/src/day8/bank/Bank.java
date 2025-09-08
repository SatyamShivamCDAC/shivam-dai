package day8.bank;

public class Bank {
    public static void main(String[] args) {

        Account account = new Account(0);

        Thread deposit = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(250);
                account.deposit(250);
            }
        });

        Thread withdraw = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(500);
            }
        });

        withdraw.setName("Deposit");
        deposit.setName("Withdraw");

        deposit.start();
        withdraw.start();
    }
}