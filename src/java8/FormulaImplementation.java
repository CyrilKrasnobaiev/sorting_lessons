package java8;

import java.util.HashMap;
import java.util.Map;

public class FormulaImplementation implements Formula {

    static Map<String, Integer> salaries = new HashMap<>();

    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }


    interface Converter<F, T> {
        T convert(F from);
        default double write(int from) {
            return Math.sqrt(from);
        }
    }
    @Override
    public double calculate(int a) {
        return sqrt(a * 100);
    }

    public static void main(String[] args) {
        Formula formula = new FormulaImplementation();

        final int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        System.out.println(stringConverter.convert(2));

        System.out.println(formula.sqrt(16));
        System.out.println(formula.calculate(100));



        //                               (from) -> Integer.valueOf(from)
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);



        FormulaImplementation impl = new FormulaImplementation();
        Converter<String, String> converter2 = impl::startsWith;
        String converted2 = converter2.convert("Java");
        System.out.println(converted2);



        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);


        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);

        System.out.println(salaries);

    }
}
