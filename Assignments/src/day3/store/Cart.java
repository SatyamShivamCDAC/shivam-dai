package day3.store;

public class Cart {
    public Dessert[] desserts;
    private int itemCount = 0;

    public Cart() {
        desserts = new Dessert[2];
    }

    public void addToCart(Dessert dessert) {
        desserts[itemCount] = dessert;
        itemCount++;
    }

    public void printQuantities() {
        System.out.println("Flavour\tQuantity");
        for (int i = 0; i < itemCount; i++) {
            System.out.format("%s\t%d\n", desserts[i].getFlavour(), desserts[i].getQuantity());
        }
    }

    public void printBill() {
        float total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += desserts[i].calculatePrice();
        }
        System.out.println("Total: " + total);
    }
}
