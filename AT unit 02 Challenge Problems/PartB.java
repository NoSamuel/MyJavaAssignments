/*
 * Sam Jin
 * AT Java
 */
import java.util.Scanner;

public class PartB {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your phone number (no space, 10 digits only): ");
        String phonenumber = in.nextLine();
        String format = "(" + phonenumber.substring(0,3) + ")" + phonenumber.substring(3,6) + "-" + phonenumber.substring(6, 10);
        System.out.println("Your formatted phone number is " + format); 
    }
}