import java.util.Scanner;

public class MenuOrganizations {

    Organization specialForMenu = new Organization("#","Адреса","Директор/СЕО","Тел.номер");
   public void callMenu() throws InterruptedException {
        String menu = "Виберіть,що бажаєте зробити, ввівши цифру, з меню нижче\n[1]Подивитись список організацій\n[2]Додати організацію\n[3]Видалити організацію\n[4]Закрити програму";
        Scanner in = new Scanner(System.in);
        int a;
        int correct = 0;



        System.out.println("Вітаємо у програмі для запису та зберігання інформації щодо організацій");
        Thread.sleep(300);
        System.out.println(menu);
        do {
            while (!in.hasNextLong()) {
                System.err.println("\tСталася помилка! \nТи ввів String або дробове число,ти думаєш з тобою тут жартують?");
                in.next();
            }
            correct=1;
            a = in.nextInt();
            if(a <1 || a>4){correct=0;System.err.println("\tСталася помилка! \nОбрано неїснуючий пункт меню");}
        }while (correct==0);

        switch (a){

            case 1:

                specialForMenu.showAllOrganization();
                callMenu();

            case 2:

                specialForMenu.addNewOrganization();
                callMenu();

            case 3:
                specialForMenu.deleteOrganization();
                callMenu();

            case 4:
                break; 
        }

    }
}
