/*Sam Jin
AT Java
 */
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean light = false;
        System.out.println("Enter your command");
        String command = in.nextLine();
        int brightness = 0;
        while (command != "q"){
        System.out.println("Enter your command");
        if (command == "on"){
            light = true;
        } else if (command == "off"){
            light = false;
        } else if (command == "view"){
            System.out.println("Current Status: " + light + "Current Brightness: " + brightness);
        } else if (command == "up"){
            if (brightness < 10){
                brightness = brightness + 1;
            } else {
                System.out.println("Already set to max brightness");
            }
        } else if (command == "down"){
            if (brightness > 0){
                brightness = brightness - 1;
            } else {
                System.out.println("Already set to min brightness");
            }
        }

        }
    }
}
