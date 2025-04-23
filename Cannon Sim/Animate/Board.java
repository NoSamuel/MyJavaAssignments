package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


public class Board extends JPanel implements KeyListener {

    //initialize variables
    private static final int B_WIDTH = 1600;
    private static final int B_HEIGHT = 900;
    private final int FLOOR = B_HEIGHT - 25;

    //declare our board object and implment the keylistener interface
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        this.setFocusable(true);
        this.addKeyListener(this);
    }

    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);

        //draw our virtual ground
        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT - FLOOR);

        //draw the horizontal black line on the ground
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, FLOOR, B_WIDTH, FLOOR);
    }

    //declare methods under the KeyListener class
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            System.out.println("The spacebar was pressed");
        } else if (e.getKeyCode() == 37) {
            System.out.println("The left arrow key was pressed");
        } else if (e.getKeyCode() == 39) {
            System.out.println("The right arrow key was pressed");
        } else if (e.getKeyCode() == 38) {
            System.out.println("The up arrow key was pressed");
        } else if (e.getKeyCode() == 40) {
            System.out.println("The down arrow key was pressed");
        }
    }

    public void keyReleased(KeyEvent e) {
        //no need to declare anything
    }

    public void keyTyped(KeyEvent e) {
        //no need to declare anything
    }
}
