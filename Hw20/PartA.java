/*
 * AT Java
 * Sam Jin
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);

        //print headers
        System.out.printf("%-10s| %-15s| %-10s%n", "ID", "Name", "Balance");
        System.out.println("---------------------------------");

        //Set up delimiter
        in.useDelimiter(",|\\s+|\\n");

        //Print info
        while (in.hasNext()) {
            int id = in.nextInt();
            String name = in.next();
            double balence = in.nextDouble(); 
            System.out.printf("%-10d | %-15s | %-10.2f%n", id, name, balence);
        }
        in.close();
    }
}