import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = in.nextLine();
        phrase = phrase.toLowerCase();
        int count = 0;
        for (int n = 0; n < phrase.length();) {
            if (phrase.charAt(n) == 'e'){
                n = n + 1;
                count = count + 1;
            } else {
                n = n;
                count = count;
            }
        }
        System.out.println("The letter e appreaed " + count + "times in the phrase.");
    }
}
