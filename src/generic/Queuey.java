package generic;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey<D> {

    LinkedList<D> queue;

    //making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }

    //checking is queus is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //size of our queue
    public int size() {
        return queue.size();
    }

    //enquing
    public void enqueue(D n) {
        queue.addLast(n);
    }

    //dequeuing an item
    public D dequeue() {
        return queue.remove(0);
    }

    //pick at first item
    public D peek() {
        return queue.get(0);
    }

    public static void main(String... args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);

        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("First out: " + numberQueue.dequeue());

        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");

        System.out.println(stringQueue.dequeue() + " ");
        System.out.println( stringQueue.dequeue() + ".");

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("Hi");
        System.out.println(stacky.pop() + " ");
        System.out.println("Peaking: " + stacky.peek());
        System.out.println(stacky.pop() + "! ");
        System.out.println(stacky.size());
    }
}
