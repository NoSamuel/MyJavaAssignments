import java.util.Scanner;
import java.lang.Math;
public class Point {
    private double x_coordinate;
    private double y_coordinate;
    private double magnitude;
    private double direction;

    // constructor.
    public Point() {
        x_coordinate = 0;
        y_coordinate = 0;
        magnitude = 0;
        direction = 0;
    }
    
    public Point(double x, double y) {
        x_coordinate = x;
        y_coordinate = y;
        magnitude = Math.sqrt(x_coordinate*x_coordinate + y_coordinate * y_coordinate);
        direction = Math.atan(y_coordinate / x_coordinate);
    }

    //return the current x-coordinate
    public double getX(){
        return x_coordinate;
    }

    //return the current y-coordinate
    public double getY(){
        return y_coordinate;
    }

    //return the current magnitude
    public double getR(){
        return magnitude;
    }

    //return the current direction
    public double getTheta(){
        return direction;
    }

    //Translate the point
    public void translate (double deltax, double deltay) {
        x_coordinate = x_coordinate + deltax;
        y_coordinate = y_coordinate + deltay;
    }

    public double distanceTo(double X1, double X2, double Y1, double Y2){
        double distanceX = X2 - X1;
        double distacneY = Y2 - Y1;
        return Math.sqrt(distanceX * distanceX + distacneY * distacneY);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the X-coordinate of your point p: ");
        double x1 = in.nextInt();
        System.out.println("Please enter the Y-coordinate of your point p: ");
        double y1 = in.nextInt();
        Point p = new Point (x1, y1);
        System.out.println("Point p has coordinates: (" + p.getX() + "," + p.getY()+ ")");
        System.out.println("Point p has polar coordinates: (" + p.getTheta() + "," + p.getR() + ")");
        p.translate(2, 3);
        System.out.println("After tranlating point p by (2,3), the resulting point is: (" + p.getX() + "," + p.getY() + ")");
        System.out.println("Please enter the X-coordinate of your point q: ");
        double x2 = in.nextInt();
        System.out.println("Please enter the Y-coordinate of your point q: ");
        double y2 = in.nextInt();
        Point q = new Point(x2, y2);
        p.distanceTo(x1, x2, y1, y2);
        System.out.println("The distance of point q to point p is: " + p.distanceTo(x1, x2, y1, y2));
    }
}