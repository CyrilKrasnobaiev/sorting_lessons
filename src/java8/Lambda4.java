package java8;

import java.util.Objects;
import java.util.function.Predicate;

public class Lambda4 {

    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        FormulaImplementation.Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from + outerNum);
        };

        FormulaImplementation.Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from + outerStaticNum);
        };
    }




    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
