package day7.twitter;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwitterStats {
    public static void main(String[] args) {

        Tweet modi = new Tweet("Modi India China Visit", 2, 9, 2025, 10000, Set.of("Modi", "China", "India", "SCO"));
        Tweet trump = new Tweet("Trump Tariffs India", 1, 9, 2025, 100000, Set.of("Trump", "US", "India", "Tariff"));
        Tweet rains = new Tweet("Maharashtra Rains", 2, 9, 2025, 7000, Set.of("Maharashtra", "Rains", "Flood"));
        Tweet ai = new Tweet("AI", 2, 7, 2025, 120000, Set.of("AI", "ChatGPT", "Claude"));
        Tweet election = new Tweet("Bihar Election", 2, 9, 2025, 2000, Set.of("Bihar", "India", "Lalu Yadav"));
        Tweet congress = new Tweet("Vote Chori", 2, 9, 2025, 3000, Set.of("VoteChori", "RahulGandhi", "ElectionCommision"));

        List<Tweet> tweets = List.of(modi, trump, rains, ai, election, congress);

        Stream<Tweet> tweetStream = tweets.stream();

        //tweetStream.filter(o -> o.getMonth() == 9).forEach(System.out::println);

        //tweetStream.filter(t -> t.getHashtags().contains("India")).forEach(System.out::println);
        //tweetStream.filter(t -> t.getHashtags().contains("Bihar")).forEach(System.out::println);

        //tweetStream.filter(t -> t.getNumberOfViews() >= 10000).forEach(System.out::println);

        //System.out.println(tweetStream.filter(t -> t.getSubject().contains("India")).count());

        Comparator<Tweet> numberOfViews = (t1, t2) -> t2.getNumberOfViews() - t1.getNumberOfViews();

        tweetStream
                .filter(t -> t.getDay() == 2 && t.getMonth() == 9 && t.getYear() == 2025)
                .sorted(numberOfViews)
                .limit(5)
                .forEach(System.out::println);
    }
}
