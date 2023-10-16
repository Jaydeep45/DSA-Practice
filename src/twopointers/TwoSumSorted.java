package twopointers;

import java.util.Scanner;

public class TwoSumSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int first = 0, last = n - 1;
        while(first < last) {
            int sum = nums[first] + nums[last];
            if(sum == t) {
                System.out.println(first + " " + last);
                break;
            }
            else if(sum > t) {
                last--;
            }
            else {
                first++;
            }
        }
    }
}
