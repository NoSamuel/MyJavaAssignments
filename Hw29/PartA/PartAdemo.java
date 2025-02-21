/*
 * Sam Jin
 * AT Java
 */
public class PartAdemo {
    public static void main(String[] args) {
        Bicycle a = new Bicycle();
        //pedal the bike ten times
        for (int i = 1; i < 10; i = i + 1){
            a.pedal();
            System.out.println("The current speed of bike a is: " + a.getSpeed());
        }

        //brake
        while(a.getSpeed() > 0){
            a.brake();
            System.out.println("The current speed of bike a is: " + a.getSpeed());
        }

        Gearedbicycle b = new Gearedbicycle(3);
        //pedal the bike ten times
        for (int i = 1; i < 10; i = i + 1){
            b.pedal();
        }

        //brake
        while (b.getSpeed() > 0) {
            b.brake();
            System.out.println("The current speed of bike b is: " + b.getSpeed());
        }
        
        //shift one gear up
        b.increase_gear();

        //pedal the bike ten times
        for (int i = 1; i < 10; i = i + 1){
            b.pedal();
            System.out.println("The current speed of bike b is: " + b.getSpeed());
        }

        //brake
        while (b.getSpeed() > 0) {
            b.brake();
            System.out.println("The current speed of bike b is: " + b.getSpeed());
        }

        System.out.println("We can see that a geared bike both accelerate and decelerates more efficiently.");
    }
}
