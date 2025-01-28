/*
 * AT Java
 * Sam Jin
 */

import java.util.Scanner;

public class Car {
    private double speed;

    //display the speed of the car
    public double getSpeed() {
        return speed;
    }

    //accelerate the car by 1 mph
    public void accelerate() {
        if (this.speed == 120) {
            System.out.println("The car is at it's max speed (120 mph)");
        } else {
            this.speed = speed + 1;
        }
    }

    //decelerate the car by 0.1 mph
    public void brake() {
        if (this.speed == 0) {
            System.out.println("The car is at it's min speed (0 mph)");
        } else {
            this.speed = speed - 0.1;
        }
    }

    //Constructor
    public Car() {
        speed = 0;
    }
    
    //Overloaded Constructor
    public Car(double initial_speed) {
        speed = initial_speed;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your command for the car: (a to accelerate, d to decelerate, s to show current speed, q to quit program)");
            String input = in.next().toLowerCase();
            if (input.equals("a")) {
                car.accelerate();
            } else if (input.equals("d")){
                car.brake();
            } else if (input.equals("s")) {
                System.out.println("The currant speed of the car is: " + car.getSpeed());
            } else if (input.equals("q")) {
                System.out.println("The car program is now closed.");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

}