/*Sam Jin
AT Java
 */
//FIXING NEEDED
import java.util.Scanner;
public class Lightcontrol { //this is the blue print that allows me build the dimmable light
    //private vaviables that represent the state of the light

    private boolean state = false;
    private int brightness = 0;
    
    //Public methods that let us interact with the light.
    public boolean getState(){
        return state;
    }

    public int getBrightness(){
        return brightness;
    }

    //turns on the light
    public void on(){
        state = true;
    }

    //turns off the light
    public void off(){
        state = false;
    }

    public void up(){
        if (brightness < 10){
            brightness = brightness + 1;
        } else {
            System.out.println("Already set to max brightness");
        }
    }

    public void down(){
        if (brightness > 0){
            brightness = brightness - 1;
        } else {
            System.out.println("Already set to min brightness");
        }
    }

    public void view(){
        if (state == true){
            System.out.println("Light is on, ");
        } else {
            System.out.println("Light is off, ");
        }
        System.out.println("The current brightness is: " + brightness);
    }

    public static void main(String[] args) {
        // create a lightcontrol
        Lightcontrol light = new Lightcontrol();

        //Get scanner
        Scanner in = new Scanner(System.in);
        String reply;
        boolean doLoop = true;
        while (doLoop){
        System.out.print("Please enter your command (up/down/on/off/view/quit):");
        reply = in.next().toLowerCase();

        if (reply.equals("quit")){
            System.out.print("The system is closed.");
            doLoop = false;
        } else if(reply.equals("view")){
            light.view();
        } else if(reply.equals("on")){
            light.on();
        } else if(reply.equals("off")){
            light.off();
        } else if(reply.equals("up")){
            light.up();
        } else if(reply.equals("down")){
            light.down();
        } else {
            System.err.println("error: undefined command detected");
        }
    }
}
}