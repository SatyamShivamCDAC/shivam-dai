package day6.streams;

import java.util.Comparator;

public class LetterUnicodeAscending implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (Character.getNumericValue(o1.charAt(0)) < Character.getNumericValue(o2.charAt(0)))
            return -1;
        else if (Character.getNumericValue(o1.charAt(0)) > Character.getNumericValue(o2.charAt(0)))
            return 1;
        else
            return 0;
    }
}
