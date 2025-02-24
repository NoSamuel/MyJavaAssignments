package mow;

public class Mower {
    private int row_mower;
    private int column_mower;
    private int direction; //max is 3

    //constuctor
    public Mower(int row, int column, int direction){
        this.row_mower = row;
        this.column_mower = column;
        this.direction = direction;
    }

    //if the user has no input, then the mower's postion is set to (1,1) and pointing up
    public Mower(){
        this.row_mower = 1;
        this.column_mower = 1;
        this.direction = 0;
    }

    //methods

    //method to reset the position
    public void setPosition (int newrow, int newcol){
        this.row_mower = newrow;
        this.column_mower = newcol;
    }

    //methods to get the position
    public int getRow() {
        return row_mower;
    }

    public int getcolumn() {
        return column_mower;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int newdirection) {
        if (this.direction > 3){
            System.out.println("Invalid direction input");
        } else {
            this.direction = newdirection;
        }
    }
    
    //methods to allow the mower to move forward
    public void moveForward(){
        if (direction == 0){
            row_mower = row_mower - 1;
        }
    }
}