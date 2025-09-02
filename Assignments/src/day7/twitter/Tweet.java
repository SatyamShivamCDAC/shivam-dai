package day7.twitter;

import java.util.Set;

public class Tweet {
    private String subject;
    private int day;
    private int month;
    private int year;
    private int numberOfViews;
    private Set<String> hashtags;

    public Tweet(String subject, int day, int month, int year, int numberOfViews, Set<String> hashtags) {
        this.subject = subject;
        this.day = day;
        this.month = month;
        this.year = year;
        this.numberOfViews = numberOfViews;
        this.hashtags = hashtags;
    }

    @Override
    public String toString() {
        return subject + " " + numberOfViews;
    }

    public String getSubject() {
        return subject;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }
}
