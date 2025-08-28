package day3.store;

public class IceCream extends Dessert {
    public IceCream(String flavour, float price, int quantity) {
        super(flavour, price, quantity);
    }

    @Override
    public float calculatePrice() {
        return (getPrice() * getQuantity());
    }
}
