package MyRelaxGame.LastProject;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    Ships one=Ships.ONE_DECKS;
    Ships two=Ships.TWO_DECKS;
    Ships three=Ships.THREE_DECKS;
    Ships four=Ships.FOUR_DECKS;
    public Game(Player player1,Player player2){
        this.player1=player1;
        this.player2=player2;
    }


    private boolean scan(String stringShip, int decks,Player player){
             if(decks==1){
                 String regex= "[\\d],[\\d]";

                 if(stringShip.matches(regex)==false)
                     System.out.println("Координаты не соотвествуют формату ");

                  if(stringShip.matches(regex)& scanmass( stringShip, decks, player)){

                   return false;
                  }
                  ///////////////
             }

             if(decks==2){
                 String regex= " {4}[//d]?,";
                 return stringShip.matches(regex);
             }
             if(decks==3){
                 String regex= "  {6}[//d]?, ";
                 return stringShip.matches(regex);         //дописать проверки на регулярные выражения+ сделать переход на проверка на поле
             }
             if(decks==4){
                 String regex= "  {8}[//d]?, ";
              return stringShip.matches(regex);
             }
return true;
    }

    public void getShips(Player player){
        int sum=1;//считает сколько глобально было добавлено/ всего*

        while (sum!=5){
            int b=0;//считает сколько локально было добавленно и сколько кораблей осталось добавить одноранговых

            if(sum==1){
                while (b!=one.getQtyGame()){
                    System.out.println("Введите"+" "+one.getNameShip()+" "+"(Формта:x1,y1)");
                    Scanner scanner=new Scanner(System.in);
                    String stringSip=scanner.nextLine();
                   boolean inspect=scan(stringSip,one.getDecks(),player);
                    while (inspect==false){
                        System.out.println("Введите без ошибок"+" "+one.getNameShip()+" "+"(Формта:x1,y1)");//
                       inspect=scan( scanner.nextLine(),one.getDecks(),player);//
                    }
                    addShips(stringSip,player);
                    b++;

                }
            }

            if(sum==2){
                while (b!=two.getQtyGame())
                {
                    System.out.println("Введите"+" "+two.getNameShip()+" "+"(Формта:x1,y1;x2,y2)");
                    Scanner scanner=new Scanner(System.in);
                    String stringSip=scanner.nextLine();
                    boolean inspect=scan(stringSip,two.getDecks(),player);
                    while (inspect==false){
                        System.out.println("Введите без ошибок"+" "+two.getNameShip()+" "+"(Формта:x1,y1)");//
                        inspect=scan( scanner.nextLine(),two.getDecks(),player);//
                    }
                    addShips(stringSip,player);
                    b++;

                }
            }
            if(sum==3){
                while (b!=three.getQtyGame())
                {
                    System.out.println("Введите"+" "+three.getNameShip()+" "+"(Формта:x1,y1;x2,y2;x3,y3)");
                    Scanner scanner=new Scanner(System.in);
                    String stringSip=scanner.nextLine();
                    boolean inspect=scan(stringSip,three.getDecks(),player);
                    while (inspect==false){
                        System.out.println("Введите без ошибок"+" "+three.getNameShip()+" "+"(Формта:x1,y1)");//
                        inspect=scan( scanner.nextLine(),three.getDecks(),player);//
                    }
                    addShips(stringSip,player);
                    b++;

                }
            }
            if(sum==4){
                while (b!=four.getQtyGame())
                {
                    System.out.println("Введите"+" "+four.getNameShip()+" "+"(Формта:x1,y1;x2,y2;x3,y3;x4,y4;)");
                    Scanner scanner=new Scanner(System.in);
                    String stringSip=scanner.nextLine();
                    boolean inspect=scan(stringSip,four.getDecks(),player);
                    while (inspect==false){
                        System.out.println("Введите без ошибок"+" "+four.getNameShip()+" "+"(Формта:x1,y1)");//
                        inspect=scan( scanner.nextLine(),four.getDecks(),player);//
                    }
                    addShips(stringSip,player);
                    b++;

                }
            }
            sum++;
        }

    }
    public boolean scanmass(String stringShip, int decks,Player player){

        if(false){
            System.out.println("Вы хотите не правильно поставаить корабыль на поле");
        }
        // проверка того что есть на поле + чтобы корабыль не залезал
        return true;
    }

    public void addShips(String coordinate,Player player){


    }


}
