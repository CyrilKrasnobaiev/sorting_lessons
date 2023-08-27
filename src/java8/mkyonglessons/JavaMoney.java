package java8.mkyonglessons;

import java.util.function.Function;

public class JavaMoney {

    public static void main(String[] args) {

        //x -> x.length() is the same as String::length
        Function<String, Integer> func = String::length;

        Integer apply = func.apply("Elina");

        System.out.println(apply);
    }
}
