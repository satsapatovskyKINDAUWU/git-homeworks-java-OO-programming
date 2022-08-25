import java.util.Scanner;

//---Меню Практичного завдання №1---
//1.Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами.
//щоб перевірити завдання введіть набір команд:
//
//double answer = TaskOne();System.out.println("Гіпотенуза:"+answer);


//2.Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
//прикладі
//[The next number for the number 179 is 180.
//The previous number for the number 179 is 178.].
//Прогалини, розділові знаки, великі і малі літери важливі!
//щоб перевірити завдання введіть набір команд:
//
//String Answer = TaskTwo();System.out.println(Answer);


//3+4.N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//Скільки яблук дістанеться кожному школяреві?
// N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//Скільки яблук залишиться у кошику?
//щоб перевірити завдання введіть набір команд:
//
//String Answer = TaskThreePlusFour();System.out.println(Answer);


public class PracticeHomework1 {
    public static void main(String[] args) {
        //вставляти команди нижче
        // \/ \/ \/ \/ \/ \/



    }

    public static double TaskOne(){
        Scanner in = new Scanner(System.in);
        double a,b;
        int correct = 0;

        do {
            System.out.println("Введіть перше число(числа цілі, позитивні, не перевищують 1000)");
            while (!in.hasNextDouble()) {
                System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
                in.next();
            }
            correct=1;
            a = in.nextDouble();
            if(a <=0 || a>1000){correct=0;}
        }while (correct==0);

        correct = 0;


        do {
            System.out.println("Введіть друге число(числа цілі, позитивні, не перевищують 1000).");
            while (!in.hasNextDouble()) {
                System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
                in.next();
            }
            correct=1;
            b = in.nextDouble();
            if(b <=0 || b>1000){correct=0;}
        }while (correct==0);

        return (Math.sqrt((a*a)+(b*b)));
    }

    public static String TaskTwo(){
        Scanner in = new Scanner(System.in);
        int a;
        int correct = 0;

        do {
            System.out.println("Введіть число(ціле число, за модулем, що не перевищує 10000)");
            while (!in.hasNextInt()) {
                System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
                in.next();
            }
            correct=1;
            a = in.nextInt();
            if(a <=0 || a>10000){correct=0;}
        }while (correct==0);
        String Answer = "The next number for the number ["+a+"] is number ["+(a+1)+"]"+"\nThe previous number for the number ["+a+"] is number ["+(a-1)+"]";
        return Answer;
    }

    public static String TaskThreePlusFour(){
        Scanner in = new Scanner(System.in);
        int a,b;
        int correct = 0;

        do {
            System.out.println("Введіть кількість школярів(ціле число)");
            while (!in.hasNextInt()) {
                System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
                in.next();
            }
            correct=1;
            a = in.nextInt();
            if(a <=0){correct=0;}
        }while (correct==0);

        correct=0;

        do {
            System.out.println("Введіть кількість яблук(ціле число)");
            while (!in.hasNextInt()) {
                System.err.println("\tСталася помилка! \nНекоректна вхідна інформація,повторіть спробу");
                in.next();
            }
            correct=1;
            b = in.nextInt();
            if(b <=0){correct=0;}
            if(b < a){correct =0;System.err.println("Неможливо поділити ["+b+"] яблук поміж ["+a+"] школярами,\nщоб після цього  у всіх було хоча б 1 яблуко");}
        }while (correct==0);

        String Answer = "Кількість яблук що дісталася кожному із ["+a+"] школярів | ["+((b-(b%a))/a+"] яблук\nЗалишок, який поклали у кошик | ["+(b%a)+"] яблук");
        return Answer;
    }

}
