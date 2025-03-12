package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;

    private int x = 0;
    private int y = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 25;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private int angle = 0;

    private class ScheduledUpdate extends TimerTask {
       /*
        * Override the run() method.
        * Update the position of our ball here.
        */

        //make sure that the image does not travel out of bonds
        public void run() {
            x += xSpeed;
            y += ySpeed;
            angle += 3;

            if (x > B_WIDTH) {
                xSpeed = -xSpeed;
            }
            
            if (y > B_HEIGHT) {
                ySpeed = -ySpeed;
            }

            if (x < B_WIDTH) {
                xSpeed = -xSpeed;
            }
            
            if (y < B_HEIGHT) {
                ySpeed = -ySpeed;
            }

            //reset angle
            if (angle > 360){
                angle = 0;
            }
            repaint();
        }
    }

    private BufferedImage img;    
    //constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        //set initial position of photo
        x = 0;
        y = 0;

        //create timer
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), INITIAL_DELAY, PERIOD_INTERVAL);

        //use try catch to open img file
        try {
            File imageFile = new File("Media/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;
        
        AffineTransform affineTransform = new AffineTransform();
    
        if (img != null) {
            affineTransform.translate(x,y);
            affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }

    }
}
