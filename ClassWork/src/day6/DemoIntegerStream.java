package day6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoIntegerStream {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 8, 2, 4, 10);
        Stream<Integer> stream = list.stream();

        //Set<Integer> squares = stream.map(n -> n * n).collect(Collectors.toSet());
        Set<Integer> squares = stream.map(n -> n * n).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(squares);

        stream = list.stream();
        List<Integer> evens = stream.filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evens);

        stream = list.stream();
        //Optional<Integer> total = stream.distinct().reduce((n1, n2) -> n1 + n2);
        Optional<Integer> total = stream.reduce((n1, n2) -> n1 + n2);
        if (total.isPresent())
            System.out.println(total.get());

        stream = list.stream();
        Optional<Integer> max = stream.reduce((n1, n2) -> n1 >= n2 ? n1 : n2);
        if (max.isPresent())
            System.out.println(max.get());

        stream = list.stream();
        Optional<Integer> min = stream.min(Integer::compareTo);
        if (min.isPresent())
            System.out.println(max.get());

        stream = list.stream();
        OptionalDouble average = stream.mapToDouble(Integer::doubleValue).average();
        if (average.isPresent())
            System.out.println(average.getAsDouble());

        stream = list.stream();
        stream.sorted().dropWhile(n -> n < 4).forEach(System.out::println);

        List<List<Integer>> matrix = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        matrix.stream().flatMap(l -> l.stream()).distinct().forEach(System.out::println);
        matrix.stream().flatMap(l -> l.stream()).limit(5).forEach(System.out::println);
    }
}
