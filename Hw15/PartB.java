/*
 * AT Java
 * Sam Jin
 */


import java.util.Scanner;
import java.util.Arrays;

public class PartB{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int values[] = new int[20];
        int n;
        for (n = 0; n < values.length; n = n + 1){
            System.out.println("Enter a integer value or 'q' to quit: ");
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                values[n] = in.nextInt();
            }
        }

        System.out.print(values[0]);
        for (int count = 1; count < values.length; count = count + 1){
            System.out.print("," + values[count]);
        }
        System.out.println(" ");

        System.out.println("Enter target integer value: ");
        int validation = in.nextInt();
        int validation_count = 0;
        
        for (int i = 1; i < values.length; i = i + 1){
            if (values[i] == validation){
                validation_count = validation_count + 1;
            }
        }
        
        System.out.println("The value " + validation + "appeared " + validation_count + " times in your orginal data set.");
    }
}