/*
 * Sam Jin
 * AT Java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        String file_name = "name.txt";
        File inputFile = new File(file_name);
        Scanner in = new Scanner(inputFile);
        while (in.hasNext()) {
            String name = ("");
            String yearborn_line;
            try {
                String line = in.nextLine();
                Scanner linesScanner = new Scanner(line);
                linesScanner.useDelimiter("[,\r\n]+");
                name = linesScanner.next().trim();
                yearborn_line = linesScanner.next().trim();
                int year;
                year = Integer.parseInt(yearborn_line);
                System.out.println(name + " was born in " + year);
            } catch (NumberFormatException exception) {
                System.out.println("I don't know what year " + name + " was born in.");
            }
        }
    }
}