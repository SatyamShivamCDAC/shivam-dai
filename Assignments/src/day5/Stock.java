package day5;

import java.util.*;

public class Stock {
    private List<Toy> toys;

    public Stock() {
        this.toys = new ArrayList<>();
    }

    public void add(Toy toy) {
        toys.add(toy);
    }

    public void remove(Toy toy) {
        toys.remove(toy);
    }

    public void listStock() {
//        for (Toy toy : toys) {
//            System.out.println(toy);
//        }

        Iterator iterator = toys.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }

    public List<Toy> filterByCategory(String category) {
        List<Toy> toysByCategory = new ArrayList<>();
        for (Toy toy : toys) {
            if (toy.getCategory().equals(category)) {
                toysByCategory.add(toy);
                //System.out.println(toy);
            }
        }
        return toysByCategory;
    }

    public void listToysByPrice(int min, int max) {
        List<Toy> toysByPrice = new ArrayList<>();
        for (Toy toy : toys) {
            if (toy.getPrice() >= min && toy.getPrice() <= max) {
                toysByPrice.add(toy);
                System.out.println(toy);
            }
        }
    }

    public void toysForAge(int age) {
        List<Toy> toysAge = new ArrayList<>();
        for (Toy toy : toys) {
            if (age >= toy.getAges()[0] && age <= toy.getAges()[1]) {
                toysAge.add(toy);
                System.out.println(toy);
            }
        }
    }

    public void listOneYearOlderToys() {
        List<Toy> toysOlder = new ArrayList<>();
        for (Toy toy : toys) {
            if (toy.getPurchaseYear() <= 2024) {
                toysOlder.add(toy);
                System.out.println(toy);
            }
        }
    }

    public void groupByCategory() {
        Map<String, List<Toy>> categoryToys = new TreeMap<>();

        for (Toy toy : toys) {
            categoryToys.put(toy.getCategory(), this.filterByCategory(toy.getCategory()));
        }
        System.out.println(categoryToys);
    }

    public List<Toy> getToys() {
        return toys;
    }
}
