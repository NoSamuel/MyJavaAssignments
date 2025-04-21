public class PartB{
    public static void printReversedTriangle(int n) {
        if (n == 0) {
            return;
        } else {
            printReversedTriangle(n - 1);
            printStars(n);
        }
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        printReversedTriangle(5);
    }
}
