package collections;

public class Node<D> {
    //Porperties
    Node<D> next;
    int data;

    public Node(int newData) {
        data = newData;
        next = null;
    }

    public Node(int newData, Node<D> newNext) {
        data = newData;
        next = newNext;
    }

    //Getters and Setters
    public int getData() {
        return data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> newNext) {
        next = newNext;
    }

    public void setData(int newData) {
        data = newData;
    }
}
