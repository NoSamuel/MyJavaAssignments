public class PartB {
    public static void print(int[][] values){
        for (int row = 0; row < values.length; row++){
            for (int col = 0; col < values.length; col++){
                System.out.print(values[row][col]);
                if (col < values[0].length - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array_one = {
            {8, 6, 7},
            {5, 3, 0},
        };
        int[][] array_two = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7},
        };

        print(array_one);
        print(array_two);

    }
}
