package day4.strings;

import java.util.Arrays;

public class MyString {

    public static boolean isAnagram(String inputString, String checkString) {
        if (inputString.length() != checkString.length())
            return false;

        int length = inputString.length();

        char[] chars1 = inputString.toCharArray();
        char[] chars2 = checkString.toCharArray();

        int[] utf1 = new int[length];
        int[] utf2 = new int[length];

        for (int i = 0; i < length; i++) {
            utf1[i] = Character.getNumericValue(chars1[i]);
            utf2[i] = Character.getNumericValue(chars2[i]);
        }

        Arrays.sort(utf1);
        Arrays.sort(utf2);

        boolean result = true;
        for (int i = 0; i < length; i++) {
            if (utf1[i] != utf2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void countString(String inputString) {
        char[] chars = inputString.toCharArray();
        int uppercase = 0;
        int lowercase = 0;
        int numbers = 0;
        int specials = 0;

        for (char c : chars) {
            if (c >= 65 && c <= 90)
                uppercase++;
            else if (c >= 97 && c <= 122)
                lowercase++;
            else if (c >= 48 && c <= 57)
                numbers++;
            else
                specials++;
        }

        System.out.format("Uppercase: %d\nLowercase: %d\nNumbers: %d\nSpecial Characters: %d",
                uppercase, lowercase, numbers, specials);
    }

    public static boolean isUpper(String inputString) {
        char[] chars = inputString.toCharArray();
        boolean isUpper = true;
        for (char c : chars) {
            if (!(c >= 65 && c <= 90))
                isUpper = false;
        }
        return isUpper;
    }

    public static String leftShift(String inputString) {
        return inputString.substring(1) + inputString.charAt(0);
    }

    public static boolean equals(String inputString, String checkString) {
        if (inputString.length() != checkString.length())
            return false;

        boolean isEqual = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != checkString.charAt(i)) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }

    public static boolean equalsIgnoreCase(String inputString, String checkString) {
        if (inputString.length() != checkString.length())
            return false;

        int length = inputString.length();

        char[] chars1 = inputString.toCharArray();
        char[] chars2 = checkString.toCharArray();

        int[] utf1 = new int[length];
        int[] utf2 = new int[length];

        for (int i = 0; i < length; i++) {
            utf1[i] = Character.getNumericValue(chars1[i]);
            utf2[i] = Character.getNumericValue(chars2[i]);
        }

        boolean isEqual = true;
        for (int i = 0; i < length; i++) {
            if (utf1[i] != utf2[i]) {
                isEqual = false;
                break;
            }
        }
        return isEqual;
    }

    public static boolean isAnagram1(String inputString, String checkString) {

        if (inputString.length() != checkString.length())
            return false;

        char[] chars1 = inputString.toCharArray();
        char[] chars2 = checkString.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean result = true;
        for (int i = 0; i < inputString.length(); i++) {
            if (chars1[i] != chars2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
