package java8.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );

    private void test1() {
        System.out.println("Test 1");
        userList.forEach(System.out::println);
    }

    private void test2() {
        System.out.println("Tests 2");
        userList.stream()
                .map(u -> new User (
                        u.getId(),
                        u.getFirstName(),
                        u.getLastName(),
                        u.getAge(),
                        u.getNationality()
                ))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    public static void main(String... args) {
        Sample sample = new Sample();
        sample.test1();

        sample.test2();
    }

}
