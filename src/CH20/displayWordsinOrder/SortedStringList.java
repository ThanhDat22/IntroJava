// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

// Created by ThanhDat Nguyen (dat.nguyen2284@gmail.com) on 2024-03-02

package CH20.displayWordsinOrder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SortedStringList {
    public static void main (String[] args) throws IOException {
        Queue<String> words = new PriorityQueue<>();

        // Open the input and output file
        FileInputStream inputFile = new FileInputStream("src/CH20/displayWordsinOrder/words.txt");
        Scanner scanner = new Scanner(inputFile);
        FileOutputStream outputFile = new FileOutputStream("src/CH20/displayWordsinOrder/displayWords.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        // Reads in the words from the file
        while (scanner.hasNext()) {
            String word = scanner.next();
            words.add(word);
        }

        // Creates a list to holds sorted elements
        ArrayList sortedList = new ArrayList();
        while(!words.isEmpty()){
            sortedList.add(words.poll());
        }
        // Writes the sorted list into the output file
        writer.write(Arrays.toString(sortedList.toArray()));

        // Close the input and output file
        writer.close();
        outputFile.close();
        scanner.close();
        inputFile.close();
    }
}
