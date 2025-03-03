package Animate;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 0;
    private final int B_HEIGHT = 0;
    
    //constructor
    public board(){
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }
}
