import java.time.Month;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calender{
    public static void main(String[] args) {
        
    
    LocalDate today = LocalDate.now();
    Month month = today.getMonth();
    int dayofmonth = today.getDayOfMonth();
    LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth() - 1);
    DayOfWeek firstDay = firstOfMonth.getDayOfWeek();

    System.out.println("                 " + month + "                  ");
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    System.out.println("today is the " + dayofmonth + "day of the month.");
    if (firstDay ==DayOfWeek.MONDAY){

    } else if (firstDay == DayOfWeek.TUESDAY){
        System.out.println("    ");
    } else if (firstDay == DayOfWeek.WEDNESDAY){
        System.out.println("        ");
    } else if (firstDay == DayOfWeek.THURSDAY){
        System.out.println("            ");
    } else if (firstDay == DayOfWeek.FRIDAY){
        System.out.println("                ");
    } else if (firstDay == DayOfWeek.SATURDAY){
        System.out.println("                    ");
    } else if (firstDay == DayOfWeek.SUNDAY){
        System.out.println("                        ");
    }
    }
}