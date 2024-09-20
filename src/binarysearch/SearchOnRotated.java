package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchOnRotated {
    public static void main(String[] args) {
//        System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));
        System.out.println(search(new ArrayList<>(Arrays.asList(4,5,6,7,0,1,2)), 7, 0));
    }

    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            // if mid points to the target
            if (arr.get(mid) == k)
                return mid;

            // if left part is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k <= arr.get(mid)) {
                    // element exists
                    high = mid - 1;
                } else {
                    // element does not exist
                    low = mid + 1;
                }
            } else { // if right part is sorted
                if (arr.get(mid) <= k && k <= arr.get(high)) {
                    // element exists
                    low = mid + 1;
                } else {
                    // element does not exist
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if(nums[mid] <= target && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
