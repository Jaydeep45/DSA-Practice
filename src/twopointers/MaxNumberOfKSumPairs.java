package twopointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));
    }
    static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i =0, j = nums.length - 1, count = 0;
        while(i < j) {
            if(nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            }else if(nums[i] + nums[j] > k)
                j--;
            else
                i++;
        }
        return count;
    }
}
