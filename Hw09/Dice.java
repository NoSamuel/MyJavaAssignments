import java.util.Scanner;
import java.util.Random;
public class Dice {
    Random generator = new Random();
    private int points = 0;
    public void roll(){
        int points = generator.nextInt(1,6);
    }
    
    public int display(){
        return points;
    }
    }

    public static void main(String[] args) {
        Dice sixsidedice = new Dice();
        Boolean doLoop = true;
        while (doLoop){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your command(r = roll, d = display, q = quit)");
        String reply = in.nextLine().toLowerCase();

        if (reply.equals("q")){
            System.out.println("The dice system is closed.");
            doLoop = false;
        } else if (reply.equals("r")){
            sixsidedice.roll();
        } else if (reply.equals("d")){
            sixsidedice.display();
        } else {
        System.out.println("error: undefined command detected.");
        }
        }
}