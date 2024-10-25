/*
 * Sam Jin
 * AT Java
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a price in decimal format (21.74): ");
        double price = in.nextDouble();
        int dollars = (int) price;
        int cents = (int) Math.round((price - dollars) * 100) ;
        System.out.println("The input contains "+ dollars + "dollars and " + cents + "cents.");
    }
}