import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//Just run the psvm inside Practice2

public class Practice2 {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
     Menu mainMenu = new Menu();
     mainMenu.turnOn();
     mainMenu.callMenu();
    }
}
