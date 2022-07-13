package MyRelaxGame.LastProject;

public class Player {
    String name;
    Field myField;
    Field outFiled;
    public Player(String name){
        this.name=name;
        this.myField=new Field();
        this.outFiled=new Field();
    }
    public void getShipsAll(Game game){
        game.getShips(this);
    }// для создания кораблей

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field getMyField() {
        return myField;
    }

    public void setMyField(Field myField) {
        this.myField = myField;
    }

    public Field getOutFiled() {
        return outFiled;
    }

    public void setOutFiled(Field outFiled) {
        this.outFiled = outFiled;
    }
}
