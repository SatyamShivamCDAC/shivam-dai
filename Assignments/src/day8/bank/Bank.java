package day8.bank;

public class Bank {
    public static void main(String[] args) {

        Account account = new Account(0);

        Thread withdraw = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 6; i++) {
                    account.withdraw(1000);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread deposit = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    account.deposit(100);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        withdraw.setName("Withdraw");
        withdraw.start();

        deposit.setName("Deposit");
        deposit.start();

    }
}
