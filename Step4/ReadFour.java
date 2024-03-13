package Step4;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Print out a running total of all the
        // values in the input file.
        try {
            Scanner fileIn = new Scanner(new File("/Users/ethan/Desktop/Projects/FileIOJava/Step4/input.txt"));
            int sum = 0;
            while (fileIn.hasNext()) {
                int lineIn = Integer.parseInt(fileIn.nextLine());
                sum += lineIn;
                System.out.println(sum);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}