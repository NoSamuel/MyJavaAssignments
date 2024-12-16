import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<Double>();
        System.out.println("Enter your double values: ");
        boolean array_status = true;
        while (array_status){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                array_status = false;
            } else {
                values.add(in.nextDouble());
            }
        }
        for (int i = 0; i < values.size(); i++){
            System.out.println(values.get(i));
        }

        double total = 0;
        for (int n = 0; n < values.size(); n++){
            total = total + values.get(n);
        }

        double average = total / values.size();

        System.out.println("The average of the numbers is: " + average);
    }
}
