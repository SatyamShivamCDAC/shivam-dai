package day6.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static boolean isUpper(String s) {
        return Character.isUpperCase(s.charAt(0));
    }

    public static void main(String[] args) {

        String[] fruits = {"banana", "Appple", "mango", "BANANA", "Chiku", "Pineapple", "ORANGE"};
        Stream<String> fruitsStream = Arrays.stream(fruits);

        System.out.println("Uppercase: ");
        fruitsStream.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        fruitsStream = Arrays.stream(fruits);
        System.out.println("\nLowercase: ");
        List<String> fruitsLower = fruitsStream.map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(fruitsLower);

        System.out.println("\nLess than n: ");
        fruitsStream = Arrays.stream(fruits);
        fruitsStream
                .filter(s -> Character.getNumericValue(s.charAt(0)) <= 23)
                .sorted(new LetterUnicodeAscending())
                .forEach(System.out::println);

        System.out.println("\nLess than n descending: ");
        fruitsStream = Arrays.stream(fruits);
        fruitsStream
                .filter(s -> Character.getNumericValue(s.charAt(0)) <= 23)
                .sorted(new LetterUnicodeDescending())
                .forEach(System.out::println);

        System.out.println("\nUpper Strings: ");
        fruitsStream = Arrays.stream(fruits);
        fruitsStream
                .filter(StreamsDemo::isUpper)
                .forEach(System.out::println);

        System.out.println("\nLength less than 6:");
        fruitsStream = Arrays.stream(fruits);
        fruitsStream
                .filter(s -> s.length() <= 6).sorted(new StringLengthDescending())
                .forEach(System.out::println);
    }
}
