package java8.vertexacademy.staticadndefaultmethods;

public interface Walkable {

    default void walk() {
        System.out.println("Ходьба");
    }
}
