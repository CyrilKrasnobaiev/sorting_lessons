package java8.pluralsight;

import java8.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Patrick");
        names.add("Lucky");
        names.add("Gogo");
        names.add("Pupa");
        List<String> places = new ArrayList<>();
        places.add("Hell");
        places.add("Heaven");

        System.out.println("******result list*******");
        System.out.println(names);
        System.out.println();

        System.out.println("******persons list*******");
        System.out.println(places);
        System.out.println();
        Consumer<String> c1 = names::add;
        Consumer<String> c2 = System.out::println;

        System.out.println("******print places list data*******");
        places.forEach(c1.andThen(c2));

        System.out.println();
        System.out.println("******filter data by name starts with P character*******");
        Stream<String> namesFiltered2 = names.stream().filter(name -> name.startsWith("P"));
        System.out.println(namesFiltered2.collect(Collectors.toList()));
        System.out.println();

        System.out.println("******filter data by name starts with P character and find first*******");
        Stream<String> namesFiltered = names.stream().filter(name -> name.startsWith("P"));
        System.out.println(namesFiltered.findFirst());
        System.out.println();

        System.out.println("******use predicate, find needed elements and create list with these elements*******");
        Predicate<String> isEqualPredicate = Predicate.isEqual("two");
        Stream<String> originalStream = Stream.of("one", "two", "three");
        Stream<String> targetStream = originalStream.filter(isEqualPredicate);
        List<String> listFromTargetStream = targetStream.toList();
        System.out.println(listFromTargetStream);
        System.out.println();


        Stream<String> testStream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = s -> s.length() < 4;

        Predicate<String> p2 = Predicate.isEqual("two");

        Predicate<String> p3 = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();
        testStream
                .peek(e -> System.out.println("First peek " + e))
                .filter(p1)
                .peek(e -> System.out.println("Second peek " + e))
                .filter(p2.or(p3))
                .peek(list::add)
                .forEach(System.out::println);

        System.out.println("******size of filtered list*******");
        System.out.println(list.size());
        System.out.println("******filtered list*******");
        System.out.println(list);


        boolean anyStartsWithA =
                names
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));

        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                names
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                names
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartsWithZ);

        long startsWithB =
                names
                        .stream()
                        .filter((s) -> s.startsWith("P"))
                        .count();

        System.out.println(startsWithB);

    }
}
