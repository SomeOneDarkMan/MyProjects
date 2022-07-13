package SimplWorkHome.five;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterF {
    public void VSriterV() throws FileNotFoundException {
        File file=new File("base.txt");
        File newfaile=new File("newbase.txt");
        Scanner scanner=new Scanner(file);
        PrintWriter printWriter=new PrintWriter(newfaile);


        while (scanner.hasNextLine()){
            String line =scanner.nextLine();
            String[] count=line.split(";");

            if(0==Integer.parseInt(count[2])){
             printWriter.println(line);

            }
        }
        printWriter.close();

    }
    public void VReadV(){

        File file=new File("newbase.txt");
        try {


        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            String DE=scanner.nextLine();
            System.out.println(DE);
        }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
