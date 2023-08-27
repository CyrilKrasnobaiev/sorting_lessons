package java8.mkyonglessons;

import java.util.function.Function;

public class JavaFunction2 {

    public static void main(String[] args) {
        Function<String, Integer> func = String::length;
        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("Elina");
        System.out.println(result);




        Function<String, Integer> toInteger = Integer::valueOf;

        Integer result3 = toInteger.apply("123");

        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        String result2 = backToString.apply("123");

        System.out.println(result2);
    }
}
