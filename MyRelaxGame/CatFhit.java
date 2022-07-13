package MyRelaxGame;

import java.util.Random;

public class CatFhit {
    String name;
    int strong;
    int speed;
    int health;
    public CatFhit(String name){
        this.name=name;
        this.randomParamets();
    }
    private void randomParamets(){
        Random random=new Random();
        this.strong=random.nextInt(100);
                this.speed=random.nextInt(50);
                        this.health=random.nextInt(25);
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrong() {
        return strong;
    }

    public String getName() {
        return name;
    }

    public String fith(CatFhit catFhit){
        int sum=this.speed+this.health+this.strong;
        int twosum=catFhit.getHealth()+catFhit.getSpeed()+catFhit.getStrong();
        if(sum<twosum){
            return this.getName();
        }else if (sum==twosum){return "ничья"; }
        else {return catFhit.getName();}
    }

    public static void main(String[] args) {
        CatFhit Tom=new CatFhit("Tom");
        CatFhit Ban=new CatFhit("Ban");
        System.out.println(Ban.fith(Tom));
    }
}
