package day3.vehicle;

public class TwoWheeler extends Vehicle {

    public TwoWheeler(int regNumber, String name, String model, int price) {
        super(regNumber, name, model, price);
    }

    @Override
    public int calculateInsurance() {
        return (super.getPrice() * 5) / 100;
    }

    public String toString() {
        return String.format("\nVehicle Details >\nRegistration Number: %d\nCompany: %s\nModel: %s\nPrice: %d\nInsurance: %d\n",
                super.getRegNumber(), super.getCompany(), super.getModel(), super.getPrice(), calculateInsurance());
    }
}