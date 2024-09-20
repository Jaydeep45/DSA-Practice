package monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2})));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[nums2.length];
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                nge[i] = -1;
            else {
                while (!stack.isEmpty() && stack.peek() < nums2[i])
                    stack.pop();
                if (stack.isEmpty())
                    nge[i] = -1;
                else
                    nge[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res[i] = nge[j];
                }
            }
        }
        return res;
    }

}
