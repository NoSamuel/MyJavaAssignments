/*
 * AT Java
 * Sam Jin
 * Part A
 */

import java.util.Scanner;

public class PartA
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int input = in.nextInt(); //input is already declared to be a string in line 9.
      input++; //replace varible name in line 18
      System.out.println("Next year, you will be " + input);
   }
}
