package binarysearch;

public interface Tree<D extends Comparable> {

    boolean isEmpty();
    int cardinality();
    boolean isMember(D element);
    NonEmptyBST<D> add(D elt);
}
