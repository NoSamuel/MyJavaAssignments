import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        //use the static constant value of Math.PI to calculate the area of a circle
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a radius: ");
        double radius = in.nextDouble();
        double area;
        area = radius * radius * Math.PI;
        System.out.println("The area of the circle is " + area);

        //use the static method to round a number
        Scanner in2 = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        double number = in2.nextDouble();
        double roundedvalue;
        roundedvalue = Math.round(number);
        System.out.println("The rounded value of the number is: " + roundedvalue);
    }
    
}
