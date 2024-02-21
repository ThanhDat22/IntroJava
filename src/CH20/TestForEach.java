package CH20;

import java.util.ArrayList;
import java.util.Iterator;

public class TestForEach {
    public static void main(String[] args){
        // Creates an ArrayList
        ArrayList<String> collection = new ArrayList<>();

        // Adds members to ArrayList
        collection.add("New_York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        collection.forEach(e->System.out.print(e.toUpperCase() + " "));
        System.out.println();
    }
}
