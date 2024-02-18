package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nBinaryTriangle(n);
    }
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(flag ? 1 + " " : 0 + " ");
                flag = !flag;
            }
            System.out.println();
        }
    }
}
