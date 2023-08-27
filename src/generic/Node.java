package generic;

import java.util.Collection;
import java.util.Iterator;

public class Node<D> {
    //Porperties
    Node<D> next;
    D data;

    public Node(D newData) {
        data = newData;
        next = null;
    }

    public Node(D newData, Node<D> newNext) {
        data = newData;
        next = newNext;
    }

    //Getters and Setters
    public D getData() {
        return data;
    }

    public Node<D> getNext() {
        return next;
    }

    public void setNext(Node<D> newNext) {
        next = newNext;
    }

    public void setData(D newData) {
        data = newData;
    }
}
