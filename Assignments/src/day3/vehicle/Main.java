package day3.vehicle;

public class Main {
    public static void main(String[] args) {

        TwoWheeler ktm = new TwoWheeler(1001, "KTM", "Duke 250", 250000);
        System.out.println(ktm);

        FourWheeler tesla = new FourWheeler(1002, "Tesla", "X", 1500000);
        System.out.println(tesla);
    }
}
