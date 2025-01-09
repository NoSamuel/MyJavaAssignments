import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        //Open the file
        File inputFile = new File("characters.txt");
        Scanner in = new Scanner(inputFile);

        //initialize counting
        int count = 0;
        int letters = 0;
        int digits = 0;

        //set delimiter
        in.useDelimiter("");

        while (in.hasNext()) {
            char c = in.next().charAt(0);
            System.out.print(c);
            if (Character.isDigit(c)) {
                digits = digits + 1;
                count = count + 1;
            } else if (Character.isWhitespace(c)) {
                count = count + 1;
            } else if (Character.isLetter(c)) {
                letters = letters + 1;
                count = count + 1;
            }
        }

        System.out.println("count = " + count);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}
