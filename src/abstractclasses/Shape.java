package abstractclasses;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public double getSide() {
        return 1.0;
    }
}
