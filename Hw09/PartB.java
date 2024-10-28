/*Sam Jin
 * AT Java
 */
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = in.nextLine();
        phrase = phrase.toLowerCase();
        int count = 0;
        for (int n = 0; n < phrase.length(); n = n + 1) {
            if (phrase.charAt(n) == 'e'){
                count = count + 1;
            }
        }
        System.out.println("The letter e' appeared " + count + " times in the phrase.");
    }
}
