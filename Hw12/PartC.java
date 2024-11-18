import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a phrase");
        String phrase = in.nextLine();
        int countvowels = countvowels(phrase);
        System.out.print("The number of vowels in your input is: " + countvowels);
    }

    public static boolean isVowel(char character){
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
    
    public static int countvowels(String phrase){
        phrase = phrase.toLowerCase();
        int i = phrase.length();
        int num_vowel = 0;
        for (int n = 0; n < i; n = n + 1){
            if (isVowel(phrase.charAt(n))){
                num_vowel = num_vowel + 1;
            }
        }
        return num_vowel;
    }
}