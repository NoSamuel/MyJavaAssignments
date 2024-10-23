import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Is today Monday? (Please respond YES/NO)");
        String day = in.nextLine();
        System.out.println("Please enter your age:");
        int age = in.nextInt();
        double discount = 0.0;
        System.out.println("what is the cost of your meal?");
        Double cost = in.nextDouble();
        if (day.toUpperCase().equals("NO")){
            if (age < 13){
            discount = discount + 5;    
            } else if (age >= 50){
                discount = discount + 7.5;
            } else {
                discount = discount;
            }
        } else {
            if (age < 13){
                discount = discount + 7.5;
            } else if (age >= 50) {
                discount = discount + 15;
            } else {
                discount = discount + 5;
            }
        }
        double final_cost = cost - cost * (discount / 100);
        System.out.printf("The final cost of your meal after a %.2f%% discount is $%.2f%n", discount, final_cost);
    }
}