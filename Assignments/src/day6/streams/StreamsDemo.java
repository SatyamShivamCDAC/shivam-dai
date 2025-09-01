package day6.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {
    public static boolean isUpper(String s) {
        return Character.isUpperCase(s.charAt(0));
    }

    public static void main(String[] args) {

        String[] fruits = {"banana", "Appple", "mango", "BANANA", "Chiku", "Pineapple", "ORANGE"};

        Stream<String> fruitsStream = Arrays.stream(fruits);

        //fruitsStream.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        fruitsStream = Arrays.stream(fruits);

        //List<String> fruitsLower = fruitsStream.map(String::toLowerCase).collect(Collectors.toList());
        //System.out.println(fruitsLower);

//        fruitsStream
//                .filter(s -> Character.getNumericValue(s.charAt(0)) <= 23)
//                .sorted(new LetterUnicodeAscending())
//                .forEach(System.out::println);


//        fruitsStream
//                .filter(s -> Character.getNumericValue(s.charAt(0)) <= 23)
//                .sorted(new LetterUnicodeDescending())
//                .forEach(System.out::println);

//        fruitsStream
//                .filter(StreamsDemo::isUpper)
//                .forEach(System.out::println);

        fruitsStream
                .filter(s -> s.length() <= 6).sorted(new StringLengthDescending())
                .forEach(System.out::println);
    }
}
