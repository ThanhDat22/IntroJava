package CH20;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {

        // Creates an ArrayList
        ArrayList<String> collection1 = new ArrayList<>();

        // Adds members to ArrayList
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        // Display array to the console
        System.out.print("A list of cities in collection1: ");
        System.out.println(collection1);
        System.out.println("Is Dallas in collection1? "
                + collection1.contains("Dallas")); // Checks whether the member is in the array
        System.out.println(collection1.size()  // Reads the size of the array
                + " cities are in collection1 now.\n");

        // Creates an ArrayList
        ArrayList<String> collection2 = new ArrayList<>();

        // Adds members to ArrayList
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        // Display array to the console
        System.out.print("A list of cities in collection2: ");
        System.out.println(collection2);

        ArrayList<String> collection3 = (ArrayList<String>)(collection1.clone());

        System.out.print("A list of cities in collection3 after clone collection 1: ");
        System.out.println(collection3);

        collection3.addAll(collection2);
        System.out.print("A list of cities in collection3 after adding collection 2: ");
        System.out.println(collection3);

    }
}
