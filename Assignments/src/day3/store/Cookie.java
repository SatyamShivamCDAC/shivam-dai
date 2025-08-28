package day3.store;

public class Cookie extends Dessert {
    public Cookie(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    @Override
    public float calculatePrice() {
        return (getPrice() * getQuantity()) / 12;
    }
}
