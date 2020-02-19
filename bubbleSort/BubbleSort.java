import java.util.Scanner;

/**
 * BubbleSort
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int arr[] = new int[n], i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = scr.nextInt();
        }
        InnerBubbleSort b = new InnerBubbleSort();
        b.bubbleSort(arr);

        for (i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        scr.close();
    }

}

/**
 * InnerBubbleSort
 */
class InnerBubbleSort {
    int i, j;

    void bubbleSort(int arr[]) {
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];

                }
            }
        }
    }

}