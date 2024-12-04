public class PartB{
    public static void main(String[] args) {
        double[] numbers = {2.2, 1.0, 3.7, 4.1, 88.0};
        double sum = 0.0;
        for (double number : numbers){
            System.out.println(number);
            sum = sum + number;
        }

        double average = sum / 5.0;

        System.out.println("Avg = " + average);
    }
}