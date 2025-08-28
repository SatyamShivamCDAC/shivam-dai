package day2.shop;

public class Store {
    private Product[] products;

    public Store(Product[] products) {
        this.products = products;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println("\nProduct Details >");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
        }
    }

    public int findProduct(int id) {
        for (int i = 0; i < products.length; i++) {
            if (id == products[i].getId())
                return i;
        }
        return -1;
    }
}

