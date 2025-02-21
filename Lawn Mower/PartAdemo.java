import java.util.Scanner;
import mow.*;

public class PartAdemo {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter the height of the yard (without walls): ");
        int height = in.nextInt();
        System.out.println("Please enter the width of the yard (without walls): ");
        int width = in.nextInt();

        //initialize yard
        Yard yard = new Yard (height, width);
        yard.printYard(yard);
    }
}
