package day3.store;

public abstract class Dessert {
    private String flavour;
    private float price;
    private int quantity;

    public Dessert(String flavour, float price, int quantity) {
        this.flavour = flavour;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract float calculatePrice();

    public String toString() {
        return String.format("Flavour: %s\tPrice: %s\tQuantity:%s\n", flavour, price, quantity);
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
