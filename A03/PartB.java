import Animate.Application;
import java.awt.EventQueue;
import sound.SoundClip;

public class PartB {
    public static void main(String[] args) {
        String path = "media/Indianmusic.wav";
        SoundClip bgm = new SoundClip(path);
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
        bgm.open();
        bgm.play(true);
        bgm.close();
    }
}