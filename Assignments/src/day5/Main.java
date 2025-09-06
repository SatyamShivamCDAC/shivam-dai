package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toy car = new Toy(101, "Car", 500, "Sports", new int[] {5, 8}, 4, 2025);
        Toy doll = new Toy(102, "Doll", 200, "Girls", new int[] {2, 6}, 1, 2024);
        Toy cube = new Toy(103, "Cube", 100, "Puzzle", new int[] {10, 15}, 7, 2023);
        Toy bat = new Toy(104, "Bat", 1000, "Sports", new int[] {5, 12}, 9, 2019);
        Toy makeUpKit = new Toy(105, "Make Up Kit", 250, "Girls", new int[] {2, 5}, 4, 2025);

        Stock stock = new Stock();
        stock.add(makeUpKit);
        stock.add(car);
        stock.add(bat);
        stock.add(doll);
        stock.add(cube);

        System.out.println("List of Stock:");
        stock.listStock();

        System.out.println("\nFilter by Sports: " + stock.filterByCategory("Sports"));


        Collections.sort(stock.getToys());
        int result = Collections.binarySearch(stock.getToys(), new Toy(102, null, 0, null, null, 0, 0));
        System.out.println("Search for toy with id 102: " + result + " index");


        System.out.println("Toys by price between 500 & 1000:");
        stock.listToysByPrice(500, 1000);

        System.out.println("\nToys for age 6:");
        stock.toysForAge(6);

        System.out.println("\nSorted toys by price:");
        Collections.sort(stock.getToys(), new PriceComparator());
        stock.listStock();

        System.out.println("\nSorted toys by name:");
        Collections.sort(stock.getToys(), new NameComparator());
        stock.listStock();

        System.out.println("\nOne year old toys:");
        stock.listOneYearOlderToys();

        System.out.println("\nToys grouped by category:");
        stock.groupByCategory();
    }
}
