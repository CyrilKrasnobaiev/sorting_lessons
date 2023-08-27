package java8.pluralsight;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateClass {

    public static void main(String[] args) {

        String target = "Bob";

        Predicate<String> p1 = s -> s.length() < 6;
        Predicate<String> p2 = s -> s.length() > 4;

        Predicate<String> andPredicate = p1.and(p2);

        Predicate<String> orPredicate = p1.or(p2);
        Predicate<String> negatePredicate = p2.negate();

        Predicate<String> isEqualPredicate = Predicate.isEqual(target);

        Predicate<String> notPredicate = Predicate.not(andPredicate);

        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        //use two predictions
        List<String> namesUsesAndPredicate = names.stream()
                .filter(andPredicate)
                .collect(Collectors.toList());

        //Uses || operator
        List<String> namesOrPredicate = names.stream()
                .filter(orPredicate)
                .collect(Collectors.toList());

        //get smaller element not from predicate condition(Bob)
        List<String> namesNegatePredicate = names.stream()
                .filter(negatePredicate)
                .collect(Collectors.toList());

        //get equal to target element in the list
        List<String> namesIsEqualPredicate = names.stream()
                        .filter(isEqualPredicate)
                        .collect(Collectors.toList());

        //compare predicates and create list with opposite elements which are not in predicate condition
        List<String> namesNotPredicate = names.stream()
                .filter(notPredicate)
                .collect(Collectors.toList());

        System.out.println(namesWithA);
        System.out.println(namesUsesAndPredicate);
        System.out.println(namesOrPredicate);
        System.out.println(namesNegatePredicate);
        System.out.println(namesIsEqualPredicate);
        System.out.println(namesNotPredicate);


        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isEven = num -> num % 2 == 0;

        boolean result1 = isPositive.test(-5);
        boolean result2 = isEven.test(10);

        System.out.println(result1); // true
        System.out.println(result2); // true
    }
}
