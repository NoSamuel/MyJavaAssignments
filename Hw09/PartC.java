import java.util.Random;
public class PartC {
    public static void main(String[] args) {
        Random generator = new Random();
        int n = 1;
        int total = 0;
        while (n < 10){
            int number = generator.nextInt(1,10);
            total = total + number;
            n = n + 1;
        }
        double ave = total / 10.0;
        System.out.print("The average of the ten numbers is: " + ave);q
    }
}
