/*
 * Sam Jin
 * AT Java
 */
import java.util.Random;
public class PartA{
    public static void main(String[] args) {
        Random generator = new Random();
        int n = 1;
        while (n <= 100){
            int number = generator.nextInt(100);
            System.out.println(number);
            n = n + 1;
        }
    }
}