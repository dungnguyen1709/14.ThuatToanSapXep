public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 10, 12, 5, 6};
        System.out.println("mang truoc khi sap xep: ");
        printArray(arr);
        System.out.println();
         sort(arr);
        printArray(arr);
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
    static void printArray(int[] arr){
        for (Integer i: arr)
            System.out.print(i + " ");
        System.out.println();

    }
}
