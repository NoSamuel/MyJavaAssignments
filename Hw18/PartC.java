import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartC {    
    public static double find_lowest(ArrayList<Double> array){
        double lowest = array.get(0);
        int index = 0;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) < lowest){
                lowest = array.get(i);
                index = i;
            }
        }
        return array.get(index);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<Double>();
        System.out.println("Enter your temperature values: ");
        boolean array_status = true;
        while (array_status){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                array_status = false;
            } else {
                values.add(in.nextDouble());
            }
        }

        System.out.println("");
        System.out.println("Here are the temperatures:");

        for (int i = 0; i < values.size(); i++){
            if (values.get(i) == find_lowest(values)){
                System.out.println(values.get(i) + " <= Lowest");
            } else {
                System.out.println(values.get(i));
            }
        }
    }
}
