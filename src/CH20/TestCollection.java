package CH20;

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
        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);
        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));
        System.out.println("\n" + collection1.size() + " cities are in collection1 now");

    }
}
