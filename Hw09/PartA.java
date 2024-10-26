import java.util.Scanner;
public class PartA{
    public static void main(String[] args) {
        System.out.println("This is a test score calculator, please enter your test scores in percentages(95% = 95):");
        System.out.println("If you want to quit, enter a negative value");
        Scanner in = new Scanner(System.in);
        double score = 0;
        int number = 0;
        double input;
        do {
            System.out.print("Enter a test score");
            input = in.nextDouble();
            score = score + input;
            number = number + 1;
        
        } while (input >= 0);
        double ave = Math.round(score/(number-1));
        int scorenumber = number - 1;
        System.out.println("The total number of scores entered is " + scorenumber + ", your average score is " + ave);
    }
}