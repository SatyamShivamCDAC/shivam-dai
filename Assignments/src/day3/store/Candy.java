package day3.store;

public class Candy extends Dessert {
    public Candy(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    @Override
    public float calculatePrice() {
        return (getPrice() * getQuantity()) / 1000;
    }
}
