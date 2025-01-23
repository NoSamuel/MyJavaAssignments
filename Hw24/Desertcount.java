import java.util.Scanner;

public class Desertcount {
    //initialize counter to 0
    public Desertcount() {
        this.c_count = 0;
        this.p_count = 0;
    }

    //Declare private variables
    private int c_count = 0;
    private int p_count = 0;

    //Methods
    public int viewcake() {
        return c_count;
    }

    public int viewpie() {
        return p_count;
    }

    public void countcake() {
        this.c_count = this.c_count + 1;
    }

    public void countpie() {
        this.p_count = this.p_count + 1;
    }

    public static void main(String[] args) {
        Desertcount cake = new Desertcount();
        Desertcount pie = new Desertcount();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Do you like cake or pie? (enter c for cake, p for pie, or q to quit and display results)");
            String input = in.next().toLowerCase();
            if (input.equals("c")) {
                cake.countcake();
            } else if (input.equals("p")) {
                pie.countpie();
            } else if (input.equals("q")) {
                System.out.println("Total number of cake enjoyers: " + cake.viewcake());
                System.out.println("Total number of pie enjoyers: " + pie.viewpie());
                break;
            } else {
                System.out.print("Invalid input");
            }
        }
    }
}