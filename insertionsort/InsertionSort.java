import java.util.Scanner;

/**
 * InsertionSort
 */
class InsertionSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int arr[] = new int[n], i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = scr.nextInt();
        }
        InnerInsertionSort b = new InnerInsertionSort();
        b.InsertionSort(arr);

        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        scr.close();
    }

}

/**
 * InnerInsertionSort
 */
class InnerInsertionSort {

    void InsertionSort(int arr[]) {
        // System.out.println(1);
        int i, j, num;
        for (i = 1; i < arr.length; i++) {
            // System.out.println(1);
            j = i - 1;
            num = arr[i];
            while (j >= 0 && arr[j] > num) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = num;

        }
    }

}