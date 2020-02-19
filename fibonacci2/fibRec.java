import java.util.Scanner;

/**
 * fibRec
 */
public class fibRec {

    // static void fibo(int n) {
    // if (n == 0 || n == 1)
    // System.out.println(n);
    // else {
    // int i = 0, j = 1, k;
    // while (n-- != 0) {
    // System.out.println(i);
    // k = i;
    // i = j;
    // j += k;
    // }
    // }

    // }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        Fibo f = new Fibo();
        f.fibo(n);
        scr.close();
    }

}

/**
 * Fibo
 */
class Fibo {
    void fibo(int n) {
        // if (n == 0 || n == 1) {
        // System.out.println(n);
        // } else {
        int i = 0, j = 1, k;
        while (n-- != 0) {
            System.out.println(i);
            k = i;
            i = j;
            j += k;
        }
        // }
    }

}