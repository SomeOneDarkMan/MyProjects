package SimplWorkHome.javaRushHomeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class Writeras {
    public static void addfile (Note note) throws FileNotFoundException {
        if(note.getNomber()%10==0){
        File file=new File("teen");
        PrintWriter writer=new PrintWriter(file);

        writer.println("Name:"+note.getName() + "-Note" + note.getNomber());
        writer.close();
    }
    }
}
