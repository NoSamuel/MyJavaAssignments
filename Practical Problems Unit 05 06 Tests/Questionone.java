import java.util.Arrays;

public class Questionone {

    public static void swap(int x, int y, int[] values) {

        //check if the values given are valid
        if (x > values.length || y > values.length || x < 0 || y < 0) {
            System.out.println("The values you have provided does not fall within the allowed range.");
        } else {
            //perform the swap
            final int xvalue = values[x];
            values[x] = values[y];
            values[y] = xvalue;
        }
    }
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }
}