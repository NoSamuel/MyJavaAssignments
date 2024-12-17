import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {

        //Takes in the integer values from the user
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<Integer>();
        System.out.println("Enter your double values: ");
        boolean array_status = true;
        while (array_status){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                array_status = false;
            } else {
                values.add(in.nextInt());
            }
        }

        System.out.println("Before: " + values);

        int i = 0;
        while (i < values.size()) {
            int val = values.get(i);

            // is it odd?
            if (val % 2 != 0) {
                // delete it.
                values.remove(i);
            } else {
                // it's even.
                i = i + 1;
            }
        }
        System.out.println("after: " + values);
        
       
    }
}
