import java.util.Scanner;
import java.util.ArrayList;

public class Questiontwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();
        System.out.println("Enter a quiz score or 'q' to quit: ");
        boolean status = true;

        //Scan in user input
        while (status == true) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                status = false;
            } else {
                scores.add(in.nextDouble());
            }
        }

        //solve the average score
        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total = total + scores.get(i);
        }
        double average = total / scores.size();

        //print with decimals alined
        System.out.println("--------------------");
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%7.2f%n", scores.get(i));
        }
        System.out.println("--------------------");
        System.out.printf("avg = %.2f", average);
    }
}
