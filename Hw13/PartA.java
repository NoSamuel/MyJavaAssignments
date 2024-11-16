import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartA {
    public static void draw(Graphics drawing){
        drawing.setColor(Color.YELLOW);
        drawing.fillOval(1, 1, 300, 300);
    }

    public static void draw2(Graphics drawing2){
        drawing2.setColor(Color.BLACK);
        drawing2.fillOval(60, 100, 30, 30);
    }

    public static void draw3(Graphics drawing3){
        drawing3.setColor(Color.BLACK);
        drawing3.fillOval(210, 100, 30, 30);
    }

    public static void draw4(Graphics drawing4){
        drawing4.setColor(Color.BLACK);
        drawing4.drawLine(75, 240, 225, 240);
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    public static void main(String[] args) {
        final int CONTENT_HEIGHT = 400;
        final int CONTENT_WIDTH = 400;

        int border_width = 0;
        int bar_height= 0;
        OS os = checkOS();

        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        //Define framesize
        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
                draw2(graph);
                draw3(graph);
                draw4(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());

    }
}
