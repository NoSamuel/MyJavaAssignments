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

        int currentSize = values.size();

        for (int i = 0; i < values.size(); i++){
            if(values.get(0) % 2.0 != 0){
                for (int n = 0; n < currentSize; n++){
                    values.get(n - 1) = values.get(i);
                }
            }
        }

    }
}
