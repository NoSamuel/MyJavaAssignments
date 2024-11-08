import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter integer one: ");
        int int1 = in.nextInt();
        System.out.println("Please enter integer two: ");
        int int2 = in.nextInt();
        System.out.println("Please enter integer three: ");
        int int3 = in.nextInt();
        if (int1 > int2){
            if (int1 < int3){
                System.out.println("Integers arranged in decreasing order: " + int3 + " " + int1 + " " + int2);
            } else { //int1 > int 3
                if (int3 < int2){
                    System.out.println("Integers arranged in decreasing order: " + int1 + " " + int2 + " " + int3);
                } else { //int3 > int2
                    System.out.println("Integers arranged in decreasing order: " + int1 + " " + int3 + " " + int2);     
                }
            }
        } else if(int1 < int2) {
            if (int2 < int3){
                System.out.println("Integers arranged in decreasing order: " + int3 + " " + int2 + " " + int1);
            } else { //int2 > int3
                if (int1 < int3){
                    System.out.println("Integers arranged in decreasing order: " + int2 + " " + int3 + " " + int1);
                } else {//int 3 > int 1
                    System.out.println("Integers arranged in decreasing order: " + int2 + " " + int1 + " " + int3);
                }
            }
        }
    }
}
