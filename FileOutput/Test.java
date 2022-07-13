package FileOutput;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Writer writer1=new Writer();
        Rreaded readed2=new Rreaded();
        Object lock =new Object();
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    readed2.readMain(lock);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    writer1.writerMain(lock);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Все ок");
    }
}
