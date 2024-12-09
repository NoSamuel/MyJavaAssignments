/*AT Java
 * Sam Jin
 */
import java.util.Random;
import java.util.Arrays;


public class PartC {
    public static int linearSearch (int[] array, int tgtVal){
        int validation_count = 0;
        for (int n = 0; n < array.length; n = n + 1) {
            if (array[n] == tgtVal){
                validation_count = validation_count + 1;
            }
        }
        return validation_count;
    }

    public static int binarySearch (int[] array, int tgtVal) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, tgtVal);
        return index;
    }
    public static void main(String[] args) {
        Random generator = new Random();
        int length = generator.nextInt(1, 10000);
        int[] values = new int[length];
        for (int n = 0; n < length; n = n + 1) {
            values[n] = generator.nextInt(1, length);
        }
        
        for (int i = 1; i < 10; i = i + 1){
            int target = generator.nextInt(1,length);
            long linear_starttime = System.nanoTime();
            linearSearch(values, target);
            long linear_endtime = System.nanoTime();
            double linear_searchtime = linear_endtime - linear_starttime;

            int[] copy_values = Arrays.copyOf(values, values.length);
            Arrays.sort(copy_values);
            long binary_starttime = System.nanoTime();
            binarySearch(copy_values, target);
            long binary_endtime = System.nanoTime();
            double binary_searchtime = binary_endtime - binary_starttime;
            System.out.println("Linear search time: " + linear_searchtime);  
            System.out.println("Binary search time: " + binary_searchtime);
        }
    }  
}
