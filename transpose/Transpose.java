// package transpose;

import java.util.Scanner;

/**
 * Transpose
 */
public class Transpose {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt(), i, j;
        int[][] mat = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = scr.nextInt();
            }
        }

        InnerTranspose t = new InnerTranspose();
        t.transpose(mat, n);
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print('\n');
        }

    }
}

/**
 * InnerTranspose
 */
class InnerTranspose {

    void transpose(int mat[][], int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                mat[i][j] = mat[i][j] ^ mat[j][i];
                mat[j][i] = mat[i][j] ^ mat[j][i];
                mat[i][j] = mat[i][j] ^ mat[j][i];
            }
        }
    }
}