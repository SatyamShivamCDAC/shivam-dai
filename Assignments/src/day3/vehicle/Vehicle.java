package day3.vehicle;

public abstract class Vehicle {
    private int regNumber;
    private String company;
    private String model;
    private int price;

    public Vehicle(int regNumber, String company, String model, int price) {
        this.regNumber = regNumber;
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public abstract int calculateInsurance();

    public int getRegNumber() {
        return regNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}