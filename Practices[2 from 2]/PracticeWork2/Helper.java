import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Helper {
    void writeEmAll(){
        boolean booleanLiteral = true; //only true or false[Size 1 byte]
        String stringLiteral = "сметанка"; //literaly string content[Size depends from size of string]
        char charLiteral = '@'; // 1 char with speacial laps[Size 2 bytes]
        byte byteLiteral = 127; // whole numbers from -128 to 127,[Size 1 byte]
        short shortLiteral = 32767;//whole numbers from -32,768 to 32,767 [Size 2 bytes]
        int intLiteral = 2147483647; // whole numbers from -2,147,483,648 to 2,147,483,647 [Size 4 bytes]
        long longLiteral = 9223372036854775807L; // whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 [Size 8 bytes]
        float floatLiteral = 224.12344421f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits [Size 4 bytes]
        double doubleLiteral = 12.3423523525124312441; // Stores fractional numbers. Sufficient for storing 15 decimal digits [Size 8 bytes]

        System.out.print("\n[1]Літерал виду boolean:|"+booleanLiteral+"|вміщає в себе або true або false,важить 1 байт"+"\n[2]Літерал виду String:|"+stringLiteral+"|вміщає в себе буквально стрічку,вага залежить від розміру"+"\n[3]Літерал виду char:|"+charLiteral+"|вміщає в себе 1 cимвол у ординарних дужках,вага 1 байт");
        System.out.print("\n[4]Літерал виду byte:|"+byteLiteral+"|вміщає в себе ціле число від -128 до 127,важить 1 байт"+"\n[2]Літерал виду short:|"+shortLiteral+"|вміщає в себе ціле число від -32,768 до 32,767,вага 2 байти"+"\n[3]Літерал виду int:|"+intLiteral+"|вміщає в себе ціле число від -2,147,483,648 до 2,147,483,647,вага 4 байти");
        System.out.print("\n[7]Літерал виду long:|"+longLiteral+"|вміщає в себе ціле число від -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807,важить 8 байт"+"\n[8]Літерал виду float:|"+floatLiteral+"|вміщає в себе число з комою що достатнє щоб зберігати від 6 до 7 чисел після коми,вага 4 байти"+"\n[9]Літерал виду double:|"+doubleLiteral+"|вміщає в себе число з комою що достатнє щоб зберігати 15 чисел після коми,вага 8 байт");

    }

    void calculateEmBoth(){
            int a;
            int b;
            char action;
            String answer = null;
            Scanner numberTaker = new Scanner(System.in);
            Scanner actionTaker = new Scanner(System.in);
            byte correct = 0;


            System.out.println("Будьте обережні,калькулятор працює у виді (обране число 1)(дія між ними)(обране число 2)");




            System.out.println("Введіть перше число типу int:");
            do {
                while (!numberTaker.hasNextInt()) {
                    System.err.println("\tСталася помилка! \nПриймаєма інформація може бути тільки у виді int,повторіть спробу для числа 1");
                    numberTaker.next();
                }
                correct = 1;
                a = numberTaker.nextInt();
            } while (correct == 0);



            System.out.println("Введіть друге число типу int:");
            do {
                while (!numberTaker.hasNextInt()) {
                    System.err.println("\tСталася помилка! \nПриймаєма інформація може бути тільки у виді int,повторіть спробу для числа 2");
                    numberTaker.next();
                }
                correct = 1;
                b = numberTaker.nextInt();
            } while (correct == 0);



            System.out.println("Число №1: " + a + "\nЧисло №2: " + b);

            System.out.println("Введіть операцію(+,-,*,/):");

        do {

            action = actionTaker.next().charAt(0);
            if((action == '+') || (action== '-') ||(action== '*') ||(action== '/')){
                correct = 1;
            }else{System.err.println("\tСталася помилка! \nВам занадто смішно щоб рахувати");correct = 0;}
        } while (correct == 0);



        switch (action) {
            case '+' -> {
                answer = "Відповідь:" + (a + b);
                System.out.println(answer);
            }
            case '-' -> {
                answer = "Відповідь:" + (a - b);
                System.out.println(answer);
            }
            case '*' -> {
                answer = "Відповідь:" + (a * b);
                System.out.println(answer);
            }
            case '/' -> {
                if(b == 0){
                    System.out.println("Cтандартний тест на нуль і ділення...");
                    answer = "Неможливо ділити на нуль";
                    System.out.println(answer);
                }else {
                    answer = "Відповідь:" + (a / b);
                    System.out.println(answer);
                }
            }
        }
    }

    void writeOnlyEven()  {
        Scanner takeNumber = new Scanner(System.in);
        byte correct = 0;
        long user_num;
        int user_wish;

        System.out.println("Введіть число щоб перевірити його на парність:");
        do {
            while (!takeNumber.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
                takeNumber.next();
            }
            correct = 1;
            user_num = takeNumber.nextInt();
        } while (correct == 0);

        if(user_num%2 == 1){
            System.out.println("Число непарне");
        }else{
            System.out.println("Число парне");
        }


        System.out.println("Обрати дію:\n[1]Перевірити ще одне число\n[2]Назад до меню");

        do {
            while (!takeNumber.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
                takeNumber.next();
            }
            correct = 1;
            user_wish = takeNumber.nextInt();
            if (user_wish<1 || user_wish>2){
                correct=0;
            }
        } while (correct == 0);

        switch (user_wish){
            case 1:
                writeOnlyEven();
            case 2:
                break;

        }

    }

    void letMeGuess(){
        Scanner let = new Scanner(System.in);
        int usernum;
        int user_wish;
        byte correct = 0;

        System.out.println("Введіть ціле число і дізнаєтесь його межі відносно чисел 0 та 10:");
        do {
            while (!let.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
                let.next();
            }
            correct = 1;
            usernum = let.nextInt();
        } while (correct == 0);



        if (usernum>=0 && usernum<=10){
            System.out.println("Це число лежить в межі [0;10]");
        }else if(usernum<0){
            System.out.println("Це число лежить в межі [-нескінченність;0]");
        }else{
            System.out.println("Це число лежить в межі [10;+нескінченність]");
        }


        System.out.println("Обрати дію:\n[1]Написати число ще раз\n[2]Назад до меню");

        do {
            while (!let.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
               let.next();
            }
            correct = 1;
            user_wish = let.nextInt();
            if (user_wish<1 || user_wish>2){
                    correct=0;
            }
        } while (correct == 0);


        switch (user_wish){
            case 1:
                letMeGuess();
            case 2:
                break;

        }



    }

    void numberEqualDayOfWeek() {
        Scanner week = new Scanner(System.in);
        String[] dayOfWeeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        byte correct;
        int user_wish;
        int usernum;

        System.out.println("Введіть число від 1 до 7 та дізнаєтесь відповідний йому день неділі,введіть 8 щоб вивести відразу усі:");
        do {
            while (!week.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
                week.next();
            }
            correct = 1;
            usernum = week.nextInt();
        } while (correct == 0);

        switch (usernum) {
            case 1:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 2:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 3:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 4:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 5:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 6:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 7:
                System.out.println(usernum + "й день тиждня | " + dayOfWeeks[usernum - 1]);
                break;
            case 8:
                for (int i = 0; i < dayOfWeeks.length; i++) {
                    System.out.println((i + 1) + "й день тиждня | " + dayOfWeeks[i]);
                }
                break;
        }
        System.out.println("Обрати дію:\n[1]Написати число ще раз\n[2]Назад до меню");

        do {
            while (!week.hasNextInt()) {
                System.err.println("\tСталася помилка! \nЦе взагалі не число або дробове число,серйозно?");
                week.next();
            }
            correct = 1;
            user_wish = week.nextInt();
            if (user_wish < 1 || user_wish > 2) {
                correct = 0;
            }
        } while (correct == 0);


        switch (user_wish) {
            case 1:
                numberEqualDayOfWeek();
            case 2:
                break;

        }
    }

    void tenTimesTask(){
        int c = 0;
        while (c<=9){
            System.out.println("Це рядок #" + (c+1));
            c++;
        }
    }

    void onlyFive(){
        int i = 1;
        int count = 1;
        do{
            if((i%5) == 0){
                System.out.println("Число №" + count + " що кратне 5:  ["+i+"]");
                count++;
            }

            i++;
        }while (i<=100);
    }

    void randomBig(){
        Random random = new Random();
        int sa = 1;
        int a = random.nextInt(6);
        for (int i = 1;i<=a;i++){
            sa*=i;
        }
        System. out.println("Числове значення виразу ["+a+"!] = "+sa);
    }
}
