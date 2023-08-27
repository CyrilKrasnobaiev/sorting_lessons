package java8.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        List<Integer> list = Arrays.asList(10);
        Integer red = list.stream()
                .reduce(0, Integer::max);

        Optional<Integer> red1 = list.stream()
                .reduce(Integer::max);

        System.out.println("red = " + red);
        System.out.println("red1 = " + red1.get());

        Optional<String> reduced =
                strings
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }
}
