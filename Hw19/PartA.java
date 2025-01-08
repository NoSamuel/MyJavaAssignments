/*
 * AT Java
 * Sam Jin
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {
    //method to find the position of the lowest value
    public static double find_lowest_value_pos (ArrayList<Double> values){
        double min_value = values.get(0);
        int index = 0;
        for (int i = 0; i < values.size(); i++){
            if (values.get(i) < min_value){
                min_value = values.get(i);
                index = i;
            }
        }
        return values.get(index);
    }

    public static void main(String[] args) throws FileNotFoundException {
        //open the file
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);
        //create an arraylist to store the values
        ArrayList<Double> temps = new ArrayList<Double>();
        while (in.hasNext()){
            double temp = in.nextDouble();
            temps.add(temp);
        }
        in.close();

    
        // print the temp with lowest
        for (int n = 0; n < temps.size(); n = n + 1){
            if(temps.get(n) == find_lowest_value_pos(temps)){
                System.out.println(temps.get(n) + " <= Lowest");
        } else {
            System.out.println(temps.get(n));
        }
    }
    }
}