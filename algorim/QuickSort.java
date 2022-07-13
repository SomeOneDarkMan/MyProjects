package algorim;


import java.util.Arrays;

public class QuickSort {

        public static int[] quickSort(int[] array, int low, int high) {
            if (array.length == 0)
                return null;//завершить выполнение, если длина массива равна 0

            if (low >= high)
                return null;//завершить выполнение если уже нечего делить

            // выбрать опорный элемент
            int middle = low + (high - low) / 2;
            int opora = array[middle];

            // разделить на подмассивы, который больше и меньше опорного элемента
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < opora) {
                    i++;
                }

                while (array[j] > opora) {
                    j--;
                }

                if (i <= j) {//меняем местами
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }

            // вызов рекурсии для сортировки левой и правой части
            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);
            return array;
        }
        public static void main(String[] args) {
            int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 ,8,-97, -94, -89, -82, -66, -56, -53, 9, 10, 10, 14,
                    14, 16, 15, -16, 18, 23, 25, 29, 32, -34, 41, 38, 44, 8, 54, 54, -18, 58, 62, 65, -6, 69, 76, 77, 77, 80, 6,
                    84, 87, 86, 3, 90, 91, 91, 92, 93, 3, 96, -1};
            System.out.println("Было");
            System.out.println(Arrays.toString(x));

            int low = 0;
            int high = x.length - 1;


            System.out.println("Стало");
            System.out.println(Arrays.toString(quickSort(x, low, high)));
        }
    }

