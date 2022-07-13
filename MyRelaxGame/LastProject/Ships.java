package MyRelaxGame.LastProject;

public enum Ships {

     FOUR_DECKS(4,1,"Четырехпалубный"),
    THREE_DECKS(3,2,"ТрехПалубный"),
    TWO_DECKS(2,3,"Двупалубный"),
    ONE_DECKS(1,4,"Однопалубный");
    private int decks;
    private String nameShip;
    private int qtyGame;
    private Ships(int decks,int qtyGame,String nameShip){
         this.decks=decks;
         this.nameShip=nameShip;
         this.qtyGame=qtyGame;
    }

    public String getNameShip() {
        return nameShip;
    }

    public int getQtyGame() {
        return qtyGame;
    }

    public int getDecks() {
        return decks;
    }
}
