package java8.pluralsight;

import java.util.*;
import java.util.function.Consumer;

public class ForEachClass {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;

        strings.forEach(c1.andThen(c2));

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numbers.forEach(System.out::println);

        Map<Integer, Integer> numbers2 = new HashMap<>();
        numbers2.put(1, 100);
        numbers2.put(2, 200);
        numbers2.put(3, 300);

        numbers2.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));


        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

        numbers3.forEach(number -> {
            if (number > 2) {
                System.out.println(number);
            }
        });

    }
}
