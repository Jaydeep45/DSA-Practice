package twopointers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://leetcode.com/problems/reverse-string/submissions/478431449/">leetcode</a>
 *
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] array = s.toCharArray();
        reverseString(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}


