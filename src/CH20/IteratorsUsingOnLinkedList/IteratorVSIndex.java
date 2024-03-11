// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

/*20.6 (Use iterators on Link List) Write a test program that stores 5 million integers in Linked List.
Test the time taken to traverse the list using an iterator vs using the get(index)
*/
package CH20.IteratorsUsingOnLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorVSIndex {
    static final int MAX_SIZE = (int)1E7;
    /** Generates the random Integer with specific range
     * @param min: the minimum Integer
     * @param max: the maximum Integer
     * @return: the random integer
     */
    private static int randomInt(int min, int max){ return min + (int)(Math.random() * (max - min + 1)); }

    public static void main(String[] args) {
        LinkedList<Integer> IntList = new LinkedList<>();

        // Adds Elements into linked list
        for (int i = 0; i < MAX_SIZE; ++i) {
            IntList.addLast(randomInt(0,MAX_SIZE));
        }

        // Calculates time traverse the list using an iterator
        long startTime = System.nanoTime(); // Start measuring execution time
        long endTime = 0;
        int executionTimeIt = 0, intGet = 0;

        Iterator<Integer> it = IntList.iterator();
        while(it.hasNext()) {
            it.next();
        }
        endTime = System.nanoTime();
        executionTimeIt = (int)(endTime - startTime);
        System.out.print("Execution Time using Iterator: " + executionTimeIt + " nanoSecond\n");

        // Calculates time traverse the list using a get(index)
        startTime = System.nanoTime(); // Start measuring execution time
        endTime = 0;
        int executionTimeGet = 0;
        int current;

        for(int i = 0; i < MAX_SIZE; ++i) {
            current = IntList.get(i);
        }
        endTime = System.nanoTime();
        executionTimeGet = (int)(endTime - startTime);
        System.out.print("Execution Time using Get(index): " + executionTimeGet + " nanoSecond\n");



    }
}
