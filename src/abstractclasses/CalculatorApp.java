package abstractclasses;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator add = Integer::sum;
        Calculator subtract = (x, y) -> x - y;
        Calculator multiple = (x, y) -> x * y;
        Calculator divide = (x, y) -> x / y;

        int result1 = add.calculate(10, 5);
        int result2 = subtract.calculate(10, 5);
        int result3 = multiple.calculate(10, 5);
        int result4 = divide.calculate(10, 5);

        System.out.println(result1); // 15
        System.out.println(result2); // 5
        System.out.println(result3);
        System.out.println(result4);
    }
}
