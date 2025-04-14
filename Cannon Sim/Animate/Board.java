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
    private final int B_WIDTH = 1600;
    private final int B_HEIGHT = 900;

    private int x = 0;
    private int y = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 25;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private int angle = 0;
    
    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;
        
        AffineTransform affineTransform = new AffineTransform();
    
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);

    }
}
