/*
 * Sam Jin
 * AT Java
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartA {
    public static int getQuizScore(Scanner score) {
        System.out.println("Please enter your quiz score: ");
        int quizscore = score.nextInt();
        if (quizscore < 0) {
            throw new ArithmeticException("Please enter a score greater than 0");
        } else {
            return quizscore;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int score = getQuizScore(in);
            System.out.println("Your quiz score is: " + score);
        } catch (InputMismatchException Exception) {
            System.err.println("Please enter integer scores only");
        } catch (Exception e) {
            System.err.println("An error occured.");
            System.out.println(e.getMessage());
        }
    }
}