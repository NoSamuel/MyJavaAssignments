import java.util.Scanner;

public class PartC{
    
    public static double volume(double r)
    {
        double vol = 4.0/3.0 * Math.PI * r * r * r;
        return vol;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: (in meters)");
        double r = in.nextDouble();
        double volsphere = volume(r);
        System.out.println("The Volume of the sphere is: " + volsphere + "m^3");
    }
    
}
