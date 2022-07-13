package algorim;

import java.util.Arrays;
import java.util.Random;

public class myQuickSort {
    public static int[] fastSort( int[] array,int low,int high ) {
                      if(array.length==0){
                          return null;
                      }
        if (low >= high)
            return null;//завершить выполнение если уже нечего делить НЕДОДЕЛАНННОООООООО


                 //if (high-low==1){
                      //   return null;}
                    // if(high-low==2) {
                    //     if (array[high] > array[low]) {
                       //      return null;
                       //  } else if (array[high] == array[low]) {
                       //      return null;
                       //  } else {
                         //    array[low] = array[high];
                        //     array[high] = temp;
                        // }
                    // }

               int mid=low +(low+high)/2;
               int opor=array[mid];
               int jmarker=low;
               int imarker=high;

               while (jmarker<=imarker){

                   while (array[jmarker]<opor){
                       jmarker++;
                   }
                   while (array[imarker]>opor){
                       imarker--;
                   }
                   if(jmarker<=imarker){
                       int temp =array[jmarker];
                       array[jmarker]=array[imarker];
                       array[imarker]=temp;
                       jmarker++;
                       imarker--;
                   }
               }
                   if (imarker<low){
                       fastSort(array,low,imarker);
                   }
                   if (jmarker>high){
                       fastSort(array,jmarker,high);
                   }



          return array;
    }// не правильный выбор опорного элемента все ломает

    public static void main(String[] args) {
        //int [] array =new int[50];
        int [] array =
        {-1, 3, 3, 6, -6, -18, 8, 9, 10, 10, 14, 14, 16, 15, -16, 18, 23, 25, 29, 32, -34, 41, 38, 44, -53, 54, 54, -56, 58, 62, 65, -66, 69, 76, 77, 77, 80, -82, 84,
                87, 86, -89, 90, 91, 91, 92, 93, -94, 96, -97};
        Random random=new Random();
       // for (int i=0;i< array.length;i++){
         //   array[i]=random.nextInt(100);}
       fastSort(array,0,array.length-1);
       System.out.println(Arrays.toString(array));


    }
}