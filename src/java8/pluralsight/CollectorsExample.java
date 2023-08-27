package java8.pluralsight;

import java8.person.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        Objects.requireNonNull(CollectorsExample.class.getResourceAsStream("people.txt"))));
                Stream<String> stream = reader.lines();
                ) {
                stream.map(line -> {
                    String[] s = line.split(" ");
                    Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                    persons.add(p);
                    return p;
            })
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);;
        }

//        Stream<Person> stream = persons.stream();

        Optional<Person> opt =
                persons.stream()
                        .filter(p -> p.getAge() >= 20)
                .min(Comparator.comparing(Person::getAge));
        System.out.println(opt);

        Optional<Person> opt2 = persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(opt2);

        Map<Integer, List<Person>> mapGroupedByAge = persons.stream()
                .collect(
                        Collectors.groupingBy(
                            Person::getAge
                        )
                );
        System.out.println(mapGroupedByAge);

        Map<Integer, Long> mapCount =
                persons.stream()
                    .collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.counting()
                        )
                );
        System.out.println(mapCount);

        Map<Integer, List<String>> mapStrings =
                persons.stream()
                    .collect(
                        Collectors.groupingBy(
                                Person::getAge,
                                Collectors.mapping(
                                        Person::getFirstName,
                                        Collectors.toList()
                                )
                        )
                );
        System.out.println(mapStrings);

        Map<Integer, Set<String>> mapThreeSet =
                persons.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getAge,
                                        Collectors.mapping(
                                                Person::getFirstName,
                                                Collectors.toCollection(TreeSet::new)
                                        )
                                )
                        );
        System.out.println(mapThreeSet);

        Map<Integer, String> mapJoining =
                persons.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getAge,
                                        Collectors.mapping(
                                                Person::getFirstName,
                                                Collectors.joining(", ")
                                        )
                                )
                        );
        System.out.println(mapJoining);
    }
}
