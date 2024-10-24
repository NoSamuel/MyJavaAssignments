/*
 * Sam Jin
 * AT Java
 */
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your interest rate:(as a percentage, for example, 5.5)");
        double interest_rate = in.nextDouble();
        System.out.println("Enter your initial balence:");
        double balence = in.nextDouble();
        int year = 1;
        System.out.printf("%-10s %-15s %-15s%n", "Year", "int earned($)", "Balence($)");
        while (year <= 5){
            double interest_earned = balence * 0.01 * interest_rate;
            balence = balence + interest_earned;
            year = year + 1;
            System.out.printf("%-10d $%-14.2f $%-14.2f%n", year, interest_earned, balence);
        }
        
    }
}
