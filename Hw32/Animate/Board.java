package Animate;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.JobAttributes.SidesType;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;
import java.awt.Shape;

public class Board extends JPanel implements KeyListener {
    private final int B_WIDTH = 400;
    private final int B_HEIGHT = 400;
    
    //constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);

    }

    
    private final int SIDE_LEN = 150;
    public void paintComponent(Graphics g) {
       // call the parent class method.
       super.paintComponent(g);

       // cast our Graphics object to a Graphics2D object.
       Graphics2D g2d = (Graphics2D) g;

       // set color.

       // draw a shape.

       int x_t = B_WIDTH / 2;
       int y_t = B_HEIGHT / 2;
       x_t = x_t - SIDE_LEN / 2;
       y_t = y_t - SIDE_LEN / 2;
       AffineTransform transform = new AffineTransform();
       transform.translate(x_t, y_t);
       transform.rotate(Math.toRadians(22.5), x_t, y_t);

       //draw out the shape
        rect rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transofromedSquare = transform.createTransformedShape(rect);
        g2d.setColor(Color.MAGENTA);
        g2d.fill(transofromedSquare);
        g2d.drawString("I love the Derryfield School!", 20, 20);
     }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
