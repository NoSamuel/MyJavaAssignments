import java.util.Scanner;
import java.util.Arrays;

public class PartA{
    public static void main(String[] args) {
        double[] scores = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your test scores or q to quit: ");
        for (int n = 0; n < scores.length; n = n + 1){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
            } else {
                scores[n] = in.nextDouble();
            }
        }   

    }
}