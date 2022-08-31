import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.sound.sampled.*;


//Just run the psvm inside LaboratoryWork1
public class LaboratoryWork1 {
    public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {
        MenuOrganizations menu = new MenuOrganizations();
        menu.turnOn();
        menu.callMenu();
    };




}
