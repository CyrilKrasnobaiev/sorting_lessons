package abstractclasses;

public interface Calculator {

    int calculate(int x, int y);

    default int calculate2(int x, int y) {
        return x*y;
    }
}
