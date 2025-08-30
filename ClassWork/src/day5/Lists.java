package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(10);
        list.add(56F);
        list.add('c');
        list.add("Hello");
        list.add(new int[] {1, 2, 3});

        System.out.println(list);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
