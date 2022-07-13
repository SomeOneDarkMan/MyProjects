package SimplWorkHome;


import FileOutput.Writer;
import SimplWorkHome.five.WriterF;
import SimplWorkHome.four.WriterH;
import SimplWorkHome.javaRushHomeWork.Note;

import java.io.FileNotFoundException;

import static SimplWorkHome.javaRushHomeWork.Note.lock1;

public class TestHomeWork {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
       /* WriterH writer=new WriterH();
       System.out.println(writer.writer());
        System.out.println(writer.parseFileToObjList());*/

       /* WriterF writerF=new WriterF();
        writerF.VSriterV();
        writerF.VReadV();*/

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i=0;i<1000;i++){
                    try {

                        Note.noteAdd(i,"thread1");


                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        });
        thread1.start();
        thread1.join();

    }
}
