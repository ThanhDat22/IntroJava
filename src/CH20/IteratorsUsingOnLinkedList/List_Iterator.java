// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

package CH20.IteratorsUsingOnLinkedList;

import java.util.NoSuchElementException;

/** An iterator for sequential lists */
public interface List_Iterator<T> extends Iterator<T> {
    /** Tests whether there exists a previous element at current iterator position.
     @return: {true} if there exists a previous element at current iterator position; {false} otherwise
     */
    boolean hasPrevious();

    /** Moves the iterator backward one position and returns the element passed by.
     @return: element passed by in the iterator movement
     @throws NoSuchElementException: there is not a previous element at current iterator position.
     */
    T previous();

    /** Removes (and returns) the previous element at current iterator position.
     @return: element removed
     @throws NoSuchElementException: there is not a previous element at current iterator position.
     */
    T removePrevious();

    /** Replaces the next element at current iterator position with the specified element.
     @param value: element with which to replace the next element at current iterator position
     @throws NoSuchElementException: there is not a next element at current iterator position.
     */
    void setNext(T value);

    /** Replaces the previous element at current iterator position with the specified element.
     @param value: element with which to replace the previous element at current iterator position
     @throws NoSuchElementException: there is not a previous element at current iterator position.
     */
    void setPrevious(T value);

    /** Inserts an element at the current iterator position.
     @param value: element to insert
     */
    void add(T value);

    /** Moves the iterator to the beginning of the list. */
    void reset();
}
