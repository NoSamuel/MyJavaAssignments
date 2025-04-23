    import java.util.Scanner;

    public class PartA {
        public static String trimString (String input) {
            return input.toLowerCase().replaceAll("[^a-z]", "");
        }

        public static boolean checkPalindrome(String input) {
            if (input.length() <= 1) {
                return true;
            } else if (input.charAt(0) != input.charAt(input.length() - 1)) { //check to see if first and last letters match
                return false;
            }

            //recursive function but a substring
            return checkPalindrome(input.substring(1, input.length() - 1));
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