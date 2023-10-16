package slidingwindow;

import java.util.Scanner;

public class MaxSumOfConsecutiveK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        int window_sum = 0, max_sum;
        for(int i = 0; i < k; i++)
            window_sum += a[i];
        max_sum = window_sum;
        for(int i = k; i < n; i++) {
            window_sum = window_sum - a[i-k] + a[i];
            max_sum = Math.max(window_sum, max_sum);
        }
        System.out.println(max_sum);
    }
}
