// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

package CH20.IteratorsUsingOnLinkedList;

/** A feature of iteration over some data structure */
@FunctionalInterface
public interface Iterable<T> {
    /** Generates an iterator at the beginning of the data structure.
     @return: an iterator at the beginning of the data structure
     */
    Iterator<T> iterator();
}
