package Animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Shape;

public class Board extends JPanel {
    private final int B_WIDTH = 500;
    private final int B_HEIGHT = 500;
    
    //constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    private final int SIDE_LEN = 150;
    public void paintComponent(Graphics g) {
       // call the parent class method.
       super.paintComponent(g);

       // cast our Graphics object to a Graphics2D object.
       Graphics2D g2d = (Graphics2D) g;

       // set color.
       g2d.setColor(Color.MAGENTA);
       // draw a shape.
       Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);

       int x_t = B_WIDTH / 2;
       int y_t = B_HEIGHT / 2;
       x_t = x_t - SIDE_LEN / 2;
       y_t = y_t - SIDE_LEN / 2;
       AffineTransform transform = new AffineTransform();
       transform.translate(x_t, y_t);
       transform.rotate(Math.toRadians(22.5), x_t, y_t);

       //draw out the shape
       Shape transoformedSquare = transform.createTransformedShape(rect);
       g2d.fill(transoformedSquare);
       g2d.drawString("I love the Derryfield School!", 20, 20);
   }
}
