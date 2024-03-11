package CH20.IteratorsUsingOnLinkedList;

import java.util.NoSuchElementException;

/** A general iterator */
public interface Iterator<T> {
    /** Tests whether there exists a next element at current iterator position.
     @return: {true} if there exists a next element at current iterator position; {false} otherwise
     */
    boolean hasNext();

    /** Moves the iterator forward one position and returns the element passed by.
     @return: element passed by in the iterator movement
     @throws NoSuchElementException: there is not a next element at current iterator position.
     */
    T next();

    /** Removes (and returns) the next element at current iterator position.
     @return: element removed
     @throws NoSuchElementException: there is not a next element at current iterator position.
     */
    T removeNext();
}
