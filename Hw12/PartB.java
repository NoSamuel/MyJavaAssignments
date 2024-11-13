/*
 * AT Java
 * Sam Jin
 * Part B
 */
import java.util.Scanner;
public class PartB{

    public static double smallest(double a, double b, double c) {
        if (a > b){
            if (b < c){
                return b;
            } else {
                return c;
            }
        } else if (c < a){
            if (b > c){
                return c;
            } else {
                return b;
            }
        }else if (b < c){
            if (b < a){
                return b;
            } else {
                return a;
            }
        }else{
            return a;
        }
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter three numbers: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double small = smallest(x, y, z);
        System.out.print("The smallest value is: " + small);
    }
}
