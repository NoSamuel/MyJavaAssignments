import java.time.LocalDate;
import java.time.LocalTime;

public class PartA{
    public static void main(String[] args) {
        LocalDate Currentdate = LocalDate.now();
        LocalTime Currenttime = LocalTime.now();

        System.out.println("Today's date is: " + Currentdate);
        System.out.println("The time is: " + Currenttime);
    }
}