package SimplWorkHome.four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriterH {

    public static List<String> writer(){
     List<String> listArr=new ArrayList<>();

    try {
        File file=new File("four.txt");
        Scanner scanner=new Scanner(file);


        while (scanner.hasNextLine()){
         listArr.add(scanner.nextLine());}


    } catch (FileNotFoundException e) {
        System.out.println("Файл не найден");
    }

return listArr;
    }
    public static List<Human> parseFileToObjList(){
        List<Human> Human = new ArrayList<>();
        try {


        File file=new File("four.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[] name=line.split(" ");
            if(0>Integer.parseInt(name[1])){
                throw new SuperExeption("Некоректный файл");
            }

            Human.add(new Human(name[0],Integer.parseInt(name[1])));
           scanner.close();

        }


        }
         catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (SuperExeption e) {
            e.printStackTrace();
        }



        return Human;
    }
}
