import java.util.Scanner;
import java.util.Arrays;

public class PartB {
    public static double average(double[] values){
        double total = 0;
        for (int i = 0; i < values.length; i = i + 1){
            total = total + values[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of variables: ");
        int length = in.nextInt();
        System.out.println("Enter your test scores or q to quit: ");
        double[] average = new double[length];
        for (int n = 0; n < average.length; n = n + 1){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                break;
            } else {
                average[n] = in.nextDouble();
            }
        }
        double final_average = average(average) / length;
        System.out.print("The average of your numbers is: " + final_average);
    }
}
