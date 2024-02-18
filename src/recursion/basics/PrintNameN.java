package recursion.basics;

import java.util.Scanner;

public class PrintNameN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNameN(n, 0, "Hello");
    }

    private static void printNameN(int n, int i, String msg) {
        if(n == i)
            return;
        System.out.println(msg);
        printNameN(n, i + 1, msg);
    }
}
