package day6;

import java.util.Arrays;

public class Song {
    private String title;
    private String[] singers;
    private String movie;
    private int year;

    public Song(String title, String[] singers, String movie, int year) {
        this.title = title;
        this.singers = singers;
        this.movie = movie;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSingers() {
        return singers;
    }

    public void setSingers(String[] singers) {
        this.singers = singers;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", singers=" + Arrays.toString(singers) +
                ", movie='" + movie + '\'' +
                ", year=" + year +
                '}';
    }
}
