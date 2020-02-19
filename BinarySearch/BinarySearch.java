// package BinarySearch;

import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(final String[] args) {
        final Scanner scr = new Scanner(System.in);
        final int n = scr.nextInt();
        int i;
        final int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = scr.nextInt();
        }
        final int key = scr.nextInt();
        final InnerBinarySearch s = new InnerBinarySearch();
        final int l = s.binarySearch(arr, key);
        if (l != -1)
            System.out.println("Found at index " + l);
        else
            System.out.println("Not found");
        scr.close();
    }
}

/**
 * InnerBinarySearch
 */
class InnerBinarySearch {

    int binarySearch(final int arr[], final int key) {
        int f = 0, r = arr.length - 1;
        int mid;
        while (f <= r) {
            mid = (f + r) / 2;
            if (key < arr[mid]) {
                r = mid - 1;
            } else if (key > arr[mid]) {
                f = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}