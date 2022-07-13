package FileOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Rreaded {

    public  void readMain(Object lock) throws IOException, ClassNotFoundException, InterruptedException {
        synchronized (lock){

Writer writer=new Writer();


            lock.wait();
            FileInputStream fileInputStream=new FileInputStream("bib");
            ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
            Persan[] read= new Persan [writer.getLight()];
             read = (Persan[]) objectInputStream.readObject();
             for (int i=0;i<read.length;i++){

                 System.out.println(read[i]);

             }
             fileInputStream.close();


            System.out.println("Я все правильно понял2");



    }}
}
