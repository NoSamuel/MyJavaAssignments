import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PartA{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("please enter your names: ");
        boolean array_status = true;
        while (array_status){
            if (in.hasNext("q") || in.hasNext("Q")){
                in.next();
                array_status = false;
            } else {
                names.add(in.nextLine());
            }
        }
        
        System.out.println("");
        

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}