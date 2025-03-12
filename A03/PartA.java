import javax.sound.sampled.LineUnavailableException;

import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class PartA {
    public static void main(String[] args) {
        //create my tone generator
        ToneGenerator tg = new ToneGenerator();

        //initialize tone generator
        try{
            tg.init();
        } catch (LineUnavailableException e){
            System.err.println("Failed to initialize player");
        }

        //play note
        tg.play(Note.A4, 300);
        tg.play(Note.C5, 300);
        tg.play(Note.D5, 300);
        tg.play(Note.G5, 600);
        tg.play(Note.F5, 300);
        tg.play(Note.E5, 300);
        tg.play(Note.D5, 600);
        tg.play(Note.C5, 300);
        tg.play(Note.E5, 300);
        tg.play(Note.A5, 600);
        tg.play(Note.G5, 300);
        tg.play(Note.F5, 300);
        tg.play(Note.E5, 600);
        tg.play(Note.D5, 300);
        tg.play(Note.C5, 300);
        tg.play(Note.A5, 600);

        tg.play(Note.REST, 200);
        tg.play(Note.A4, 300);
        tg.play(Note.C5, 300);
        tg.play(Note.D5, 300);
        tg.play(Note.G5, 600);
        tg.play(Note.F5, 300);
        tg.play(Note.E5, 300);
        tg.play(Note.D5, 600);
        tg.play(Note.C5, 300);
        tg.play(Note.E5, 300);
        tg.play(Note.A5, 600);
        tg.play(Note.G5, 300);
        tg.play(Note.F5, 300);
        tg.play(Note.E5, 600);
        tg.play(Note.D5, 300);
        tg.play(Note.C5, 300);
        tg.play(Note.A4, 600);
        tg.close();
    }
}
