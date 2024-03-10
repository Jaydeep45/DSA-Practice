package stacks;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 2)));
    }
    static int[] maxSlidingWindow(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++)
            max = Math.max(max, nums[i]);
        stack.push(max);
        for(int i = k; i < nums.length; i++) {
            stack.push(Math.max(nums[i], stack.peek()));
        }
        int[] res = new int[stack.size()];
        int j = 0;
        for(int i: stack) {
            res[j++] = i;
        }
        return res;
    }
}
