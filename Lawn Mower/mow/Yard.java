package mow;

public class Yard {
    //Initialize variables and 2D array
    private int height;
    private int width;
    private char[][] yard;
    int wall_height;
    int wall_width;

    //Constructor
    public Yard(int height, int width) {

        //grass covered part of the lawn
        this.height = height;
        this.width = width;

        //calculate the height and width of lawn with wall included
        wall_height = height + 2;
        wall_width = height + 2;

        //initialize the array to draw the yard
        yard = new char[wall_height][wall_width];


        //draw the top wall
        for (int i = 0; i < wall_width; i++){
            yard [0][i] = 'R';
        }

        //draw the middle for portion with wall and grass
        for (int row = 1; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == 0 || col == wall_width - 1){
                    yard [row][col] = 'R';
                } else {
                    yard [row][col] = '+';
                }
            }
        }

        //draw the bottom wall
        for (int i = 0; i < wall_width; i++){
            yard [wall_height-1][i] = 'R';
        }
    }

    //method to return the value of the character in a certain position
    public void getValue (int x, int y){
        System.out.print(yard[x-1][y-1]);
    }

    //method to override the value of a given position
    public void override (int x, int y, char input) {
        yard [x-1][y-1] = input;
    }

    //method to return the height of the yard
    public int getHeight (Yard yard) {
        return height;
    }

    //method to return the width of the yard
    public int getWidth (Yard yard) {
        return width;
    }

    //method to print the yard
    public void printYard (Yard yard) {
        for (int i = 0; i < wall_height; i++) {
            for (int j = 0; j < wall_width; j++) {
	            System.out.print(this.yard [i][j]);
            }
            System.out.println("");
        }
    }
}