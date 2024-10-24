/*
 * Sam Jin
 * AT Java
 */
public class PartA {
public static void main(String[] args) {
    double concentration = 100;
    int years = 0;

    while (concentration > 1.0) {
        concentration = concentration / 2.0;
        years = years + 30;
    } 

    System.out.println("It will take " + years + " years for 99% of the materials to decay");
    System.out.println("The remaining material concentration is: "+ concentration + "%");
    }   
}