package abstractclasses;

public class Rectangle extends Shape implements Drawable {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public void draw() {
        System.out.println("Drawing rectangle.");
    }
}
