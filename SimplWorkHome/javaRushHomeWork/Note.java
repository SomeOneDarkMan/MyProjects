package SimplWorkHome.javaRushHomeWork;

import java.io.FileNotFoundException;
/*запись в файлы чисел которые кратны 10, в два потока синхронизировать ,чтобы запись была каждые 100 итераций цикла. */
public class Note {
    String name;
    int nomber;
   public static Object lock1=new Object();

    public String getName() {
        return name;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomber() {
        return nomber;
    }
    public static void noteAdd(int nomber,String name) throws FileNotFoundException, InterruptedException {
        Note note=new Note();
        note.setNomber(nomber);
        Note finalNote = note;


        note.setName(name);
        System.out.println(note.getName() + "-Note" + note.getNomber());
        note=null;


    }

}
