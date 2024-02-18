package maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(gcd(n,m));
    }
    static int gcd(int n, int m) {
        if(m == 0)
            return n;
        return gcd(m, n %m);
    }
}
