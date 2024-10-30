import java.time.Month;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Calender{
    public static void main(String[] args) {
        
    //Get the current date
    LocalDate today = LocalDate.now();

    //Get the month
    Month month = today.getMonth();
    int dayofmonth = today.getDayOfMonth();

    //Get the first day of the month
    LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth() - 1);
    DayOfWeek firstDay = firstOfMonth.getDayOfWeek();

    System.out.println("           " + month + "                  ");
    System.out.println("Mon Tue Wed Thu Fri Sat Sun");
    //System.out.println("today is the " + dayofmonth + "day of the month.");


    int daycount = 0;
    if (firstDay ==DayOfWeek.MONDAY){
        daycount = 1;

    } else if (firstDay == DayOfWeek.TUESDAY){
        System.out.print("    ");
        daycount = 2;
    } else if (firstDay == DayOfWeek.WEDNESDAY){
        System.out.print("        ");
        daycount = 3;
    } else if (firstDay == DayOfWeek.THURSDAY){
        System.out.print("            ");
        daycount = 4;
    } else if (firstDay == DayOfWeek.FRIDAY){
        System.out.print("                ");
        daycount = 5;
    } else if (firstDay == DayOfWeek.SATURDAY){
        System.out.print("                    ");
        daycount = 6;
    } else if (firstDay == DayOfWeek.SUNDAY){
        System.out.print("                        ");
        daycount = 7;
    }

    // print an asterik next to the current day
    for (int day = 1; day <= month.length(false); day = day + 1){
        System.out.printf("%3d", day);
        if (day == today.getDayOfMonth()){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
        if (daycount % 7 == 0){
            System.out.println("");
        }
        daycount = daycount + 1;
    }
}
}