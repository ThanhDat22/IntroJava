package CH20;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args){
        // Creates an ArrayList
        ArrayList<String> collection = new ArrayList<>();

        // Adds members to ArrayList
        collection.add("New_York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        // Creates an iterator for the list
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){ // Traverses the list
            System.out.print(iterator.next().toUpperCase() + " "); // Upper case letter
        }
        System.out.println();
    }
}
