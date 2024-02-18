package maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        if(m == rev)
            System.out.println("palindrome");
        System.out.println(rev);
    }
    static int reverse(int n) {
        if(n == 0)
            return n;
        return 10 * (n % 10) + reverse(n/10);
    }
}
