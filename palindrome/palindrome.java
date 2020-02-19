import java.util.Scanner;

/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Innerpalindrome p = new Innerpalindrome();
        p.palindrome(n);
        scanner.close();
    }
}

/**
 * Innerpalindrome
 */
class Innerpalindrome {
    void palindrome(int n) {
        int m = n, r, num = 0;
        while (n != 0) {
            r = n % 10;
            n /= 10;
            num = num * 10 + r;
        }
        if (m == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

    }
}