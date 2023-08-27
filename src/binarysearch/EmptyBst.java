package binarysearch;

public class EmptyBst<D extends Comparable> implements Tree<D> {

    public EmptyBst() {

    }

    public boolean isEmpty() {
        return true;
    }

    public int cardinality() {
        return 0;
    }

    public boolean isMember(D elt) {
        return false;
    }
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }
}

