package FileOutput;

import java.io.Serializable;

public class Persan implements Serializable {
    int id;
    String name;
    public Persan(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Persan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
