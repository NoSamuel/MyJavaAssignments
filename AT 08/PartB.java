import java.util.Scanner;
import org.derryfield.util.Geometry;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of your sphere: ");
        double radius = in.nextDouble();
        System.out.println("Volume: " + Geometry.calcVolSphere(radius));
        System.out.println("Surface Area: " + Geometry.calcSurfSphere(radius));
    }
    
}
