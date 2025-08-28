package day3.vehicle;

public class FourWheeler extends Vehicle {
    public FourWheeler(int regNumber, String company, String model, int price) {
        super(regNumber, company, model, price);
    }

    @Override
    public int calculateInsurance() {
        return (super.getPrice() * 10) / 100;
    }

    public String toString() {
        return String.format("\nVehicle Details >\nRegistration Number: %d\nCompany: %s\nModel: %s\nPrice: %d\nInsurance: %d\n",
                super.getRegNumber(), super.getCompany(), super.getModel(), super.getPrice(), calculateInsurance());
    }
}