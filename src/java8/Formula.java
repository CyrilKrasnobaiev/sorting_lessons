package java8;

public interface Formula {

    double calculate(int a);
    //default methods representation, can be a lot of default methods in the interface
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
