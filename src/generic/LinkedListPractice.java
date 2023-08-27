package generic;

import collections.Node;

import java.util.LinkedList;

public class LinkedListPractice<D> {

    //properties
    Node<D> head;
    int count;

    //constructors
    public LinkedListPractice() {
        head = null;
        count = 0;
    }
    public LinkedListPractice(Node<D> newHead) {
        head = newHead;
        count = 1;
    }
    //methods
    public void add(int newData) {
        collections.Node<D> temp = new collections.Node<D>(newData);
        collections.Node<D> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public int get(int index) {
//        if (index <= 0) {
//            return -1;
//        }
        Node<D> current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove() {
        //remove from the back of the list
        Node<D> current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);

    }
}
