import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.ArrayList;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        //set up reader and writter
        File inputFile = new File("quizzes.txt");
        File outputFile = new File ("quizzesMod.txt");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFile);
        
        //initialize variables
        double total = 0;
        int count = 0;

        // output to file
        while (in.hasNext()){
            double score = in.nextDouble();
            total = total + score;
            out.printf("Quiz %03d: %6.2f%n",count, score);
            count++;
        }

        //calculate average
        double ave = total / count;

        //write end of file
        out.println("--------------------");
        out.printf("Average: %.2f%n", ave);

        in.close();
        out.close();
    }
}
