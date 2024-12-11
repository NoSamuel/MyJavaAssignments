import java.util.Scanner;
import java.util.Arrays;

public class PartA{
    public static int find_lowest_score_position (double[] values){
        double smallest_value = values[0];
        int index = 0;
        for (int i = 1; i < values.length; i++){
            if (values[i] < smallest_value){
                smallest_value = values[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        double[] scores = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your test scores or q to quit: ");
        int count = 0;
        for (int n = 0; n < scores.length; n = n + 1){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                break;
            } else {
                scores[n] = in.nextDouble();
                count = count + 1;
            }
        }   
        int currentsize = count;

        System.out.println("Here are your scores:");
        for (int n = 0; n < count; n = n + 1){
            System.out.println("Test score: " + scores[n]);
        }
        
        System.out.print("Do you wish to drop the lowest score? (respond y to do so)");
        if (in.hasNext("y") || in.hasNext("Q")){
            for (int i = find_lowest_score_position(scores) + 1; i < count; i++){
                scores[find_lowest_score_position(scores) - 1] = scores[find_lowest_score_position(scores)]; 
            }
            currentsize = currentsize - 1;
        }

        System.out.println("Here are your updated scores:");
        for (int pos = 0; pos < currentsize; pos = pos + 1){
            System.out.println("Test score: " + scores[pos]);
        }
    }
}