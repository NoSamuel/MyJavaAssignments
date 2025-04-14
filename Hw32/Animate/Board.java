package Animate;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import sound.SoundClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Board extends JPanel implements KeyListener, MouseListener {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private final int SIDE_LENGTH = 20;

    //initialize variables of coordinates of the ball
    private int x = B_WIDTH / 2 - SIDE_LENGTH / 2;
    private int y = B_HEIGHT / 2 - SIDE_LENGTH / 2;

    private void playBlip() {
        try {
            String path = "Media/blip.wav";
            SoundClip blip = new SoundClip(path);
            blip.open();
            blip.play();
        } catch (Exception e) {
            System.err.println("Failed to locate/open blip sound file");
        }
    }

    private void playBlop() {
        try {
            String path = "Media/blop.wav";
            SoundClip blop = new SoundClip(path);
            blop.open();
            blop.play();
        } catch (Exception e) {
            System.err.println("Failed to locate/open blop sound file");
        }
    }

    //initialize board that reponds to the event listener interface
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    //initialize paint component to draw ball
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(x, y, SIDE_LENGTH, SIDE_LENGTH);
        
        //add listeners
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    //methods to repaint the ball according to the input from user
    public void mousePressed(MouseEvent e) {
        x = e.getX() - SIDE_LENGTH / 2;
        y = e.getY() - SIDE_LENGTH / 2;
        playBlip();
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 32) {
        x = B_WIDTH / 2 - SIDE_LENGTH / 2;
        y = B_HEIGHT / 2 - SIDE_LENGTH / 2;
        playBlop();
        repaint();
        }
    }
    
    


    public void mouseClicked(java.awt.event.MouseEvent e) {
        
    }
    
    public void mouseReleased(java.awt.event.MouseEvent e) {
        
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
        
    }
    
    public void mouseExited(java.awt.event.MouseEvent e) {
        
    }

    public void keyTyped(KeyEvent e) {

    }
    
    public void keyReleased(KeyEvent e) {

    }
}
