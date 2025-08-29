package day4.strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Anagram");

        System.out.print("String 1: ");
        String string1 = scanner.next();

        System.out.print("String 2: ");
        String string2 = scanner.next();

        System.out.println(MyString.isAnagram(string1, string2));

        System.out.println("\nCount String");
        System.out.print("String: ");
        String string3 = scanner.next();

        MyString.countString(string3);

        System.out.println("\n\nIs Upper");
        System.out.print("String: ");
        String string4 = scanner.next();

        System.out.println(MyString.isUpper(string4));

        System.out.println("\nLeft Shift");
        System.out.print("String: ");
        String string5 = scanner.next();

        System.out.println(MyString.leftShift(string5));

        System.out.println("\nEquals");

        System.out.print("String 1: ");
        String string6 = scanner.next();

        System.out.print("String 2: ");
        String string7 = scanner.next();

        System.out.println(MyString.equals(string6, string7));

        System.out.println("\nEquals Ignore Case");

        System.out.print("String 1: ");
        String string8 = scanner.next();

        System.out.print("String 2: ");
        String string9 = scanner.next();

        System.out.println(MyString.equalsIgnoreCase(string8, string9));
    }
}
