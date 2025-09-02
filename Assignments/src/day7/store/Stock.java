package day7.store;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {
    public static void main(String[] args) {

        Toy car = new Toy(101, "Car", 1500, "Sports", "Adolescent", 4, 2025);
        Toy doll = new Toy(102, "Doll", 200, "Girls", "Child", 1, 2024);
        Toy cube = new Toy(103, "Cube", 100, "Puzzle", "Adult", 7, 2023);
        Toy bat = new Toy(104, "Bat", 1000, "Sports", "Adult", 9, 2019);
        Toy makeUpKit = new Toy(105, "Make Up Kit", 250, "Girls", "Infant", 4, 2025);

        List<Toy> toys = List.of(car, doll, cube, bat, makeUpKit);

        Stream<Toy> toyStream = toys.stream();

        //toyStream.forEach(System.out::println);

        Map<String, List<Toy>> toysByCategory = toyStream.collect(Collectors.groupingBy(Toy::getCategory));
        //System.out.println(toysByCategory);

        toyStream = toys.stream();
        //toyStream.filter(t -> t.getPrice() >= 500 && t.getPrice() <= 1000).forEach(System.out::println);

        //Comparator<Toy> toyComparator = Comparator.comparing(Toy::getPrice).thenComparing(Toy::getCategory);
        toyStream = toys.stream();
        Map<String, List<Toy>> toysByPriceCategory = toyStream.sorted(Comparator.comparing(Toy::getPrice)).collect(Collectors.groupingBy(Toy::getCategory));
        //System.out.println(toysByPriceCategory);

        toyStream = toys.stream();
        //toyStream.filter(t -> t.getPurchaseYear() <= 2024).forEach(System.out::println);

        toyStream = toys.stream();
        for (String key : toysByCategory.keySet()) {
            System.out.println(key + " " + toysByCategory.get(key).size());
        }

        toyStream = toys.stream();
        System.out.println(toyStream.min(Comparator.comparing(Toy::getPrice)));
        toyStream = toys.stream();

        System.out.println(toyStream.max(Comparator.comparing(Toy::getPrice)));

        toyStream = toys.stream();
        Map<String, List<Toy>> ageToys = toyStream.collect(Collectors.groupingBy(Toy::getAgeGroup));
        for (String key : ageToys.keySet()) {
            System.out.println(key + " " + ageToys.get(key).size());
        }
    }
}
