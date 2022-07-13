package MyRelaxGame.LastProject;

public class FinleProject {
    public static void main(String[] args) {
     Player player1=new Player("Bob");
     Player player2=new Player("Jone");
     Game game=new Game(player1,player2);
     player1.getShipsAll(game);
     player2.getShipsAll(game);
    }
}
