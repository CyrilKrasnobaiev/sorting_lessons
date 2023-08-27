package java8.vertexacademy.staticadndefaultmethods;

public class Runner implements Human, Walkable {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.walk();
        Human.run();

        System.out.println(Math.ceil(5.50));
        System.out.println(Math.floor(5.50));
        System.out.println(Math.round(5.50));
    }

    @Override
    public void walk() {
        Human.super.walk();
    }
}
