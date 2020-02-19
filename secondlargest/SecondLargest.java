// package SecondLargest;

import java.util.Scanner;

/**
 * SecondLargestsecondlargest
 */
public class SecondLargest {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }
        InnerSecondLargest sl = new InnerSecondLargest();
        System.out.println(sl.secondLargest(arr));
    }
}

/**
 * InnerSecondLargestsecondlargest
 */
class InnerSecondLargest {
    int secondLargest(int arr[]) {

        int l, sl = -23768, i;
        l = -23768;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] < l && arr[i] > sl) {
                sl = arr[i];

            }
        }
        return sl;
    }
}