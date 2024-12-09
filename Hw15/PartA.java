import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class PartA{
    public static void main(String[] args) {
        double[] values = new double[10];
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter up to 10 values or hit q to quit: ");

        while (count < 10){
            if (in.hasNextDouble()){
                values[count] = in.nextDouble();
                count = count + 1;  
            } else if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                break;
            } else {
                System.out.println("Invalid input");
                in.next();
            }
        }
        
        for (int i = 0; i < count; i = i + 1){
            System.out.print(values[i] + "*");
        }

        //create a reversed array
        double[] reversedvalues = new double[count];
        for (int n = 0; n < count; n = n + 1){
            reversedvalues[n] = values[n]
        }
        Arrays.sort(reversedvalues, Collections.reverseOrder());



    }
}