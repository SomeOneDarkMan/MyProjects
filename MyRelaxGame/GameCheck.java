package MyRelaxGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameCheck {
    int b = 0;
    public int  also () {
        Scanner scanner=new Scanner(System.in);
        this.b=scanner.nextInt();
        return this.b;
    }
    public static void main(String[] args) {
        GameCheck nen=new GameCheck();
        Random random=new Random();
        Scanner scanner2=new Scanner(System.in);
int i=0;
        boolean exit2=false;
        do {

            int run=random.nextInt(100);
            int runtwo=random.nextInt(100);
            System.out.println(run+"+"+runtwo);
           while (i==0){
            try{

            nen.also();
            i++;}
            catch (Exception e)  {
                System.out.println("Что-то пошло не так,попробуй еще раз");
            }}


            if(nen.b==run+runtwo){
                System.out.println("Правильно!!!");
            }
            else {System.out.println("Не правильно,Будь внимательнее");}
            System.out.println("Чтобы завершить игру напиши:-exit или выход");

           String exit=scanner2.nextLine();

           /* if (scanner.nextLine()=="help"){
                System.out.println("Чтобы завершить игру напиши:-exit или выход");
            }*/

            if (exit.equalsIgnoreCase("exit")|exit.equalsIgnoreCase("выход")){
            System.exit(0);}
            i--;

        }while (true);

    }
}
