public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    //Override the toString() method
    public String toString() {
        return getClass().getName() + " [Name on the card = " + name + ", Year issued = " + year + "]";
    }

    //Override the equals() method
    public boolean equals(Object obj) {
        final double SmallNumber = 0.0000000001;
        //check if they are of the same class
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        
        //if they are of the same class, check if the arguments passed to them are equals
        BaseballCard otheBaseballCard = (BaseballCard) obj;
        if (this.name.equals(otheBaseballCard.name) && Math.abs(this.year - otheBaseballCard.year) < SmallNumber) {
            return true;
        } else {
            return false;
        }
    }
}