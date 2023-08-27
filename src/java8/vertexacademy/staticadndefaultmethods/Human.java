package java8.vertexacademy.staticadndefaultmethods;

public interface Human {

    default void walk() {
        System.out.println("Ну, я пошел...");
    }

    static void run() {
        System.out.println("Ну, я побежал...");
    }

}
