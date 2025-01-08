import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        int count = 0;
        while (in.hasNext()) {
            String word = in.next();
            System.out.println(word);
            count++;
        }
        in.close();
    }
}