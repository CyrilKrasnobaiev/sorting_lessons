package java8.pluralsight;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamsMapFlatMap {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        List<Integer> list3 = Arrays.asList(3, 5, 7);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        System.out.println(list);

        Function<List<?>, Integer> size = List::size;

        //the same
//        Function<List<Integer>, Stream<Integer>> flatmapper = l -> l.stream();
        Function<List<Integer>, Stream<Integer>> flatmapper = Collection::stream;

        list.stream()
                .map(List::size)
                //the same
//                .map(l -> l.size())
                .forEach(System.out::println);

        list.stream()
                .map(flatmapper)
                .forEach(System.out::println);

        list.stream()
                .flatMap(flatmapper)
                .forEach(System.out::println);
    }


}
