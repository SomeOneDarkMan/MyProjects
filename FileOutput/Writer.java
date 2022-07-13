package FileOutput;

import java.io.*;

public class Writer  {
    int light;

    public void  writerMain(Object lock) throws IOException {

        synchronized(lock){
            Persan[] persans= {new Persan(1,"Lox"),new Persan(2,"Lox"),new Persan(3,"Lox"),new Persan(4,"Lox")};

            FileOutputStream opp= new FileOutputStream("bib");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(opp);


            this.light=persans.length;
            try {
                objectOutputStream.writeObject(persans);
                opp.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                lock.notify();
                System.out.println("Я все сделал:"+this);
            }




        }






    }


    public int getLight() {
        return light;
    }
}
