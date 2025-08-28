package com.util;

public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(1, 1, 2025);
        MyDate date2 = new MyDate(2, 1, 2025);
        Calender calender = new Calender(new MyDate[] {date1, date2});
    }
}
