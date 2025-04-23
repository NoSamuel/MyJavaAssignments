import java.util.Scanner;

public class PartB {
    public static String trimString(String input) {
        return input.toLowerCase().replaceAll("[^a-z]", "");
    }

    public static boolean checkPalindrome(String input) {
        //check to see if the input is a single letter
        if (input.length() <= 1) {
            return true;
        } else {
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - (i + 1))) { //check to see if first and last letters match
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a word/sentence to check");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String newInput = trimString(input);

        if (checkPalindrome(newInput) == true) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}