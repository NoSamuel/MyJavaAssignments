/*Sam Jin
 * AT Java
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("sales_by_cat.txt");
        Scanner in = new Scanner(inputFile);


        //start to extract
        while(in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n]+");
            String dept = lineScanner.next().trim();
            String manager = lineScanner.next().trim();
            String revenue_line = lineScanner.next().trim();
            Double revenue;
            if(revenue_line.equals("n/a")){
                revenue = 0.0;
            }else{
                revenue = Double.valueOf(revenue_line);
            } 
            System.out.printf("%-17s | %-10s | $%10.2f%n", dept, manager, revenue);
        }

        in.close();
    }
}
