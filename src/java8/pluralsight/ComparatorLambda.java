package java8.pluralsight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class ComparatorLambda {


    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T extends Integer, G extends Double> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                .map(mapperFunction)
                .collect(Collectors.toList());
    }



    public static void main(String[] args) {

        //the same
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        };

        //the same
        Comparator<String> compLambda = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        //the same
        Comparator<String> compLambdaSimple = comparingInt(String::length);

        Comparator<Integer> compLambdaInteger = Integer::compare;

        List<String> listStrings = Arrays.asList("***", "*****", "****", "***");
        listStrings.sort(compLambdaSimple);


        List<Integer> listIntegers = Arrays.asList(12,42,67,23,55,77,12,55,33,22,55,79,123,12,54,23,76,65,87);
        listIntegers.sort(compLambdaInteger);

        listStrings.forEach(e -> System.out.print(e + " "));
        System.out.println();
        listIntegers.forEach(integers -> System.out.print(integers + " "));
        System.out.println();
        listStrings.forEach(System.out::print);
        System.out.println();
        listIntegers.forEach(System.out::print);
        System.out.println();
        Integer[] arrayInteger = {1, 4, 6, 1,2, 4, 6,8,2,1,6,8,23,6,8,1};
        Double[] arrayDouble = {5.23, 234.34, 123.66, 654.23};

        List<Integer> newListInteger = fromArrayToList(arrayInteger);
        newListInteger.sort(compLambdaInteger);
        List<Double> newListDouble = fromArrayToList(arrayDouble);
        System.out.println(newListInteger);
        System.out.println(newListDouble);


        for (int i : listIntegers) {
            System.out.print(" " + i);
        }
        System.out.println();
        for(String s : listStrings) {
            System.out.println(s);
        }
    }
}
