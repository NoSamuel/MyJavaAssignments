package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sound.SoundClip;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class Board extends JPanel {

    Random generator = new Random();
    private int gen_x = generator.nextInt(1, 6);
    private int gen_y = generator.nextInt(1, 6);
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;

    private int x = 0;
    private int y = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 50;
    private final int PERIOD_INTERVAL = 25;
    private final int ORIGINAL_SPEEDx = gen_x;
    private final int ORIGINAL_SPEEDy = gen_y;

    private int xSpeed = 4;
    private int ySpeed = 4;
    private int angle = 0;

    


    private class ScheduledUpdate extends TimerTask {
       /*
        * Override the run() method.
        * Update the position of our ball here.
        */

       //make sure that the image does not travel out of bonds
        

        public void run() {
            try{
                String path = "media/ow.wav";
                SoundClip ow = new SoundClip(path);

            x += xSpeed;
            y += ySpeed;
            angle += 3;
            ow.open();

            if (x > 720) {
                xSpeed = -ORIGINAL_SPEEDx;
                ow.play();
            } else if (y > 720) {
                ySpeed = -ORIGINAL_SPEEDy;
                ow.play();
            } else if (x < 0) {
                xSpeed = ORIGINAL_SPEEDx;
                ow.play();
            } else if (y < 0) {
                ySpeed = ORIGINAL_SPEEDy;
                ow.play();
            }

            //reset angle
            if (angle > 360){
                angle = 0;
            }
            repaint();
        } catch (Exception e) {
                System.err.println("Failed to open audio file");
            }
            
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
