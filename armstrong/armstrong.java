import java.util.Scanner;

/**
 * armstrong
 */
public class armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Innerarmstrong p = new Innerarmstrong();
        p.armstrong(n);
        scanner.close();
    }
}

/**
 * Innerarmstrong
 */
class Innerarmstrong {
    void armstrong(int n) {
        int m = n, r, sum = 0, count = 0;

        while (m != 0) {
            m /= 10;
            count++;
        }
        m = n;
        while (m != 0) {
            r = m % 10;
            m /= 10;
            sum += Math.pow(r, count);
        }
        if (n == sum)
            System.out.println("armstrong");
        else
            System.out.println("Not a armstrong");

    }
}