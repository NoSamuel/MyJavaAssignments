public class PartD {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n = n + 1){
            for (int dot = 0; dot < 5 - n; dot = dot + 1){
                System.out.print(".");
            }
            for (int num = 0; num < n; num = num + 1){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
