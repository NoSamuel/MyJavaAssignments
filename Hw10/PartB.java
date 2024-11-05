import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of cookies: ");
    int num = in.nextInt();
    double discount;
    if (num > 6) {
        discount = 0.05;
    } else if (num > 12) {
        discount = 0.10;
    } //there is a logical error in this if statement: if the num satisfies the else if statement (>12), then it must also satisfy the if statment, causing a conflict in which value to assign
    //you have to swap their order to fix it. 
    System.out.println("Discount = " + discount); //there needs to be a initial value assigned to the variable discount in line 8 (Runtime error)

}
}
