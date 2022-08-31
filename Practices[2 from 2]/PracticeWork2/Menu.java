import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Menu {



        Helper specialForMenu = new Helper();
        public void callMenu()  {
            String menu = "Виберіть,що бажаєте зробити, ввівши цифру, з меню нижче\n\n[1]Показати всі ітерали в Джава(примітивні та 1 посиланнєвий тип данних)\n[2]Простий калькулятор\n[3]Перевірити парність числа\n[4]Дізнатись межі числа відносно 0 та 10\n[5]Відповідність цифра - день тиждня\n[6]Виведи мені швидко 10 рядків!\n[7]Виведи числа кратні 5 від [1;100]\n[8]Рандомний факторіал\n[9]Вихід з программи";
            Scanner in = new Scanner(System.in);
            int menuchooser;
            byte correct = 0;
            System.out.println(menu);
            do {
                while (!in.hasNextInt()) {
                    System.err.println("\tСталася помилка! \nТи ввів String або дробове число,ти думаєш з тобою тут жартують?");
                    in.next();
                }
                correct=1;
                menuchooser = in.nextInt();
                if(menuchooser <1 || menuchooser>9){correct=0;System.err.println("\tСталася помилка! \nОбрано неїснуючий пункт меню");}
            }while (correct==0);

            if(menuchooser==1){specialForMenu.writeEmAll();callMenu();}
            if(menuchooser==2){specialForMenu.calculateEmBoth();callMenu();}
            if(menuchooser==3){specialForMenu.writeOnlyEven();callMenu();}
            if(menuchooser==4){specialForMenu.letMeGuess();callMenu();}
            if(menuchooser==5){specialForMenu.numberEqualDayOfWeek();callMenu();}
            if(menuchooser==6){specialForMenu.tenTimesTask();callMenu();}
            if(menuchooser==7){specialForMenu.onlyFive();callMenu();}
            if(menuchooser==8){specialForMenu.randomBig();callMenu();}
            if(menuchooser==9){System.exit(0);}
        }


        void turnOn() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
            File file = new File("musicforwaiting.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(20000);

        }
    }

