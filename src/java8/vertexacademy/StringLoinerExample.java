package java8.vertexacademy;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringLoinerExample {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("John");
        joiner.add("Jack");
        joiner.add("Jill");
        System.out.println(joiner);

        System.out.println();

        StringJoiner joiner2 = new StringJoiner(", ", "{", "}");
        joiner2.add("John");
        joiner2.add("Jack");
        joiner2.add("Jill");
        System.out.println(joiner2);

        System.out.println();

        String numbers = String.join("-", "1", "0", "1", "0");
        System.out.println(numbers); //output 1-0-1-0

        System.out.println();

        List<String> databases = Arrays.asList("OracleDB", "Mongo", "PostgreSQL", "MySQL");
        String string = String.join(", ", databases);
        System.out.println(string); //output OracleDB, Mongo, PostgreSQL, MySQL

        System.out.println();

        List<String> frameworks = Arrays.asList("Spring", "Hibernate", "JPA", "JSF");
        String collect = frameworks.stream()
                .collect(Collectors.joining("; "));
        System.out.println(collect); //output Spring; Hibernate; JPA; JSF
    }
}
