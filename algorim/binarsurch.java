package algorim;

import java.util.Arrays;
import java.util.Random;

public class binarsurch {
     public static int foundBinarSurch(int[] array,int looking){
         int first =0;
         int last =array.length-1;

        while (first<=last){
             int mid=(first+last)/2;//вырожение надо брать в скобки так как сначала выплняеть деление,а мы ищем средние между двух чисел
            if(array[mid]<looking){
                first=mid+1;//делаем половину массива для большей части увеличивая начало массива путюм присвоения началу номер среднего элемента+1
            }
            else if(array[mid]>looking){
                last=mid-1;//делаем половину массива до меньшей части уменьшая последнию границу массива
            }
             if (looking==array[mid]){
                System.out.println("Нащли! "+"номер элемента массива: "+mid+" Значение найденное: "+array[mid]+" Значение искомое:"+looking);
                return looking;
            }//



        }
         System.out.println("Ничего не нашли");

         return 0;

     }


    public static void main(String[] args) {
        int[] array=new int[1000];
        Random random=new Random();
        for(int i=0;i<1000;i++)
            array[i]= random.nextInt(300);
             Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            foundBinarSurch(array,132);

        //бинарный поиск работает только с сортированным массивом
        //бинарный алгорим это нечто очень прикольное
        //hi gone how much cars need you
    }
}
