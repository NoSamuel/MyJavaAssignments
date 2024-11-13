import java.util.Scanner;
import java.util.Random;
public class Dice {
    Random generator = new Random();
    private int points = 1;
    public void roll(){
        points = generator.nextInt(1,7);
    }
    
    public void display(){
        if (points == 1){
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   0   |");
            System.out.println("|       |");
            System.out.println("+-------+");
        } else if (points == 2){
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("| 0   0 |");
            System.out.println("|       |");
            System.out.println("+-------+");
        } else if (points == 3){
            System.out.println("+-------+");
            System.out.println("|0      |");
            System.out.println("|   0   |");
            System.out.println("|      0|");
            System.out.println("+-------+");
        } else if (points == 4){
            System.out.println("+-------+");
            System.out.println("|0     0|");
            System.out.println("|       |");
            System.out.println("|0     0|");
            System.out.println("+-------+");
        } else if (points == 5){
            System.out.println("+-------+");
            System.out.println("|0     0|");
            System.out.println("|   0   |");
            System.out.println("|0     0|");
            System.out.println("+-------+");
        } else if (points == 6){
            System.out.println("+-------+");
            System.out.println("|0     0|");
            System.out.println("|0     0|");
            System.out.println("|0     0|");
            System.out.println("+-------+");
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
}
}
