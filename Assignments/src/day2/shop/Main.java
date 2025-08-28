package day2.shop;

public class Main {
    public static void main(String[] args) {

        Product bag = new Product(101, "Bag", 800);
        Product watch = new Product(102, "Watch", 1500);

        Store store = new Store(new Product[] {bag, watch});

        store.displayProducts();

        System.out.println(store.findProduct(103));
    }
}
