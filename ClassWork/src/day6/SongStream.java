package day6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SongStream {
    public static void main(String[] args) {

        List<Song> songList = new ArrayList<>();
        songList.add(new Song("T1", new String[] {"S1", "S2"}, "M1", 2025));
        songList.add(new Song("A2", new String[] {"S2", "S3"}, "M2", 2024));
        songList.add(new Song("L3", new String[] {"S4", "S1"}, "M1", 2025));

        Stream stream = songList.stream();

        Comparator<Song> byTitle = Comparator.comparing(Song::getTitle);
        Comparator<Song> byYear = Comparator.comparing(Song::getYear).thenComparing(byTitle);
        stream.sorted(byYear).forEach(System.out::println);


    }
}
