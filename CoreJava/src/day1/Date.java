package day1;

public class Date {
    private int day;
    private String month;
    private int year;

    public Date() {
        day = 1;
        month = "January";
        year = 2025;
    }

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Date: " + day + "/" + month + "/" + year;
    }
}