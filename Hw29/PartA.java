class Bicycle {
    private int speed; //
    private final int MAX_SPEED = 30;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void pedal() {
        // increase the virtual speed of the bicycle.
        speed = speed + 1;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
    }

    public void brake() {
        speed = speed - 1;
        if (speed < 0) {
            speed = 0;
        }
    }
}

//creates the child class of Bicycle named gearedbicycle

class Gearedbicycle extends Bicycle {

    private int gear;
    private final int MAX_GEAR = 7;
    private final int MAX_GEARED_SPEED = 50;

    //Constuctor
    public Gearedbicycle (int gear){
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newGear) {
        gear = newGear;
    }

    public void increase_gear () {
        //increase the virtual gear of the bicycle
        gear = gear + 1;
        if (gear > MAX_GEAR){
            gear = MAX_GEAR;
        }
    }

    public void decrease_gear () {
        //increase the virtual gear of the bicycle
        gear = gear - 1;
        if (gear < 1){
            gear = 1;
        }
    }

    public void pedal() {
        int newSpeed = getSpeed() + getGear();
        if (newSpeed > MAX_GEARED_SPEED){
            newSpeed = MAX_GEARED_SPEED;
        }
        setSpeed(newSpeed);
    }

    public void brake() {
        //as the geared bicycle breaks, it decreases by the current gear
        int newSpeed = getSpeed() - getGear();
        if (newSpeed < 0){
            newSpeed = 0;
            System.out.println("The bicycle has stopped");
        }
        setSpeed(newSpeed);
    }
}