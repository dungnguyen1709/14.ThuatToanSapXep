package cai_dat_thuat_toan_sapxep_chon;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Enter a size : ");
//        int size = sc.nextInt();
//        int[] list = new int[size];
//        System.out.println(" Enter " + list.length + " values : ");
//        for (int i = 0; i < list.length; i++) {
//            list[i] = sc.nextInt();
//        }
//        System.out.print(" Your input list : ");
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + "\t");
//        }
//        System.out.println("\nBegin sort processing...");
//        System.out.print(list);
        double [] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
       selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

    }

    public static void selectionSort(double[] list) {
        for (int k = 0; k < list.length - 1; k++) {
            double currentMin = list[k];
            int currentMinIndex = k;
            for (int j = k + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMin != k) {
                list[currentMinIndex] = list[k];
                list[k] = currentMin;

            }
        }
    }
}
