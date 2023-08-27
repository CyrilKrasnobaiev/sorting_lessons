package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {

    public static void main(String[] args) {

        var names = Arrays.asList("Elina", "Elena", "Kyrylo", "Lucky");
        var quantities = Arrays.asList(10,9,4,14,21,30,12,3);

        /*
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        */

        names.sort((a, b) -> b.compareTo(a));


        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        quantities.sort(Comparator.naturalOrder());
        System.out.println(quantities);

    }


}
