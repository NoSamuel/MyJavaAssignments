/*
 * Sam Jin
 * AT Java
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA{
    public static void main(String[] args) {
        String name = "missing.txt";
        File inputFile = new File(name);
        boolean file_presence = false;
        while (file_presence == false) {
            try {
            Scanner in = new Scanner(inputFile);
            while (in.hasNext()){
                String word = in.next();
                System.out.println(word);
            }
            in.close();
            file_presence = true;
            } catch (FileNotFoundException exception) {
                System.err.println("Error: The File is not found");
                Scanner newfile = new Scanner(System.in);
                System.out.println("Would you like to input a new file or fix the current location? (Enter # to quit)");
                if (newfile.hasNext("#")) {
                    System.out.println("The system is now closed");
                    break;
                } else {
                    Scanner filename = new Scanner(System.in);
                    System.out.println("Please enter the location of the file:");
                    name = filename.nextLine();
                }
            }
        }
    }
}