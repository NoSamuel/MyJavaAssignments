import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("Top5Unemployment.txt");
        Scanner in = new Scanner(inputFile);
        
        //print header
        System.out.println("-----------------------------------------------------------");
        System.out.println("                Top 5 Unemployments Rates");
        System.out.println("-----------------------------------------------------------");


        //start to extract
        while (in.hasNextLine()){
            String line = in.nextLine();
            Scanner linescan = new Scanner(line);
            linescan.useDelimiter("[,\\n]+");
            String country = linescan.next().trim();
            String percent = linescan.next().trim();
            double percentage = Double.valueOf(percent);
            String rank = linescan.next().trim();
            int ranking = Integer.valueOf(rank);
            String region = linescan.next().trim();

            System.out.printf("Ranked #%3d: %16s, %6.2f%%, %20s%n", ranking, country, percentage, region);
        }

        System.out.println("-----------------------------------------------------------");
        
    }
}