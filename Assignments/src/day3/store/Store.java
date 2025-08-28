package day3.store;

import java.util.Scanner;

public class Store {

    public Store() {
    }

    public void takeOrder() {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);


        int itemNumber = 0;
        while (true) {
            System.out.println("\nMenu\n1. Candy\t2. Cookie\t3. IceCream\t4. Exit\n");

            System.out.print("Item Number: ");
            itemNumber = scanner.nextInt();

            if (itemNumber == 4) {
                break;
            }

            System.out.print("Flavour: ");
            String flavour = scanner.next();

            System.out.print("Price: ");
            float price = scanner.nextFloat();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            switch (itemNumber) {
                case 1:
                    cart.addToCart(new Candy(flavour, price, quantity));
                    break;
                case 2:
                    cart.addToCart(new Cookie(flavour, price, quantity));
                    break;
                case 3:
                    cart.addToCart(new IceCream(flavour, price, quantity));
                    break;
                default:
                    System.out.println("Enter a valid item number.");
            }
        }
        cart.printQuantities();
        cart.printBill();

    }
}
