package li_thuyet;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] list) {
//        for (int i = 0; i < list.length - 1; i++) {
//            int currentMin = list[i];
//            int currentMinIndex = i;
//            for (int j = i + 1; j < list.length; j++) {
//                if (currentMin > list[j]) {
//                    currentMin = list[j];
//                    currentMinIndex = j;
//                }
//            }
//            if (currentMinIndex != i) {
//                list[currentMinIndex] = list[i];
//                list[i] = currentMin;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] list = {2, 3, 2, 5, 6, 1, -2, 14, 12};
//        selectionSort(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
        int position = 0;
        for (int i = 0; i < list.length; i++) {
            position = i;
            int temp = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < temp) {
                    temp = list[j];
                    position = j;
                }
            }
            list[position] = list[i];
            list[i] = temp;
        }
       // System.out.print(Arrays.toString(list));
    }

    public static void main(String[] args) {
        int[] list = {2,3,2,5,6,1,-2,14,12};
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}