package algorim;

import java.util.Arrays;

import static algorim.binarsurch.foundBinarSurch;

public class NewFastSortWhenItChoseElementsOporNevernoCrash {
     public static int[] newfastSort(int[] source, int leftBorder, int rightBorder)
     {
         int leftMarker = leftBorder;
         int rightMarker = rightBorder;
         int pivot = source[(leftMarker + rightMarker) / 2];
         do {
             // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
             while (source[leftMarker] < pivot) {
                 leftMarker++;
             }
             // Двигаем правый маркер, пока элемент больше, чем pivot
             while (source[rightMarker] > pivot) {
                 rightMarker--;
             }
             // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
             if (leftMarker <= rightMarker) {

                 // Левый маркер будет меньше правого только если мы должны выполнить swap
                 if (leftMarker < rightMarker) {
                     int tmp = source[leftMarker];
                     source[leftMarker] = source[rightMarker];
                     source[rightMarker] = tmp;
                 }
                 // Сдвигаем маркеры, чтобы получить новые границы
                 leftMarker++;
                 rightMarker--;
             }
         } while (leftMarker <= rightMarker);

         // Выполняем рекурсивно для частей
         if (leftMarker < rightBorder) {
             newfastSort(source, leftMarker, rightBorder);
         }
         if (leftBorder < rightMarker) {
             newfastSort(source, leftBorder, rightMarker);
         }
         return source;
     }
    //делал по обяснению книги
    public static void main(String[] args) {
        int [] array ={-1,-3,10,-1,-3,10,-1,-3,10};//опорный элемент в быстрой сортировки надо выбирать по праив
        newfastSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));




    }
}
