/*
 * Sam Jin
 * AT Java Unit 3&4 Test Part A
 */
public class PartA{
    public static void main(String[] args) {
        int count = 1;
        int total = 0;
        while (count <= 100){
            total = total + count;
            count = count + 1;
        }
    
    double ave = total / 100.0;
    System.out.println("The average is: " + ave);
    }
}
//This program is tested with values 100, 10 and 5 :)