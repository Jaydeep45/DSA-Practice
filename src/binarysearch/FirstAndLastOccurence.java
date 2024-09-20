package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLastPosition(new ArrayList<>(Arrays.asList(0,1,1,5)),4,1)));
    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        return new int[]{search1(arr, n, k, -1, 0, n - 1), search2(arr,n,k,-1, 0, n - 1) };
    }
    public static int search1(ArrayList<Integer> nums, int n, int t, int res, int low, int high) {
        if(low > high) {
            return res;
        }
        int mid = low + (high - low)  / 2;
        if(nums.get(mid) == t) {
            return search1(nums, n, t, mid, low, mid - 1);
        } else if(nums.get(mid) < t) {
            return search1(nums, n, t, res, mid + 1, high);
        } else {
            return search1(nums, n, t, res, low, mid - 1);
        }
    }
    public static int search2(ArrayList<Integer> nums, int n, int t, int res, int low, int high) {
        if(low > high) {
            return res;
        }
        int mid = low + (high - low)  / 2;
        if(nums.get(mid) == t) {
            return search2(nums, n, t, mid, mid + 1, high);
        } else if(nums.get(mid) < t) {
            return search2(nums, n, t, res, mid + 1, high);
        } else {
            return search2(nums, n, t, res, low, mid - 1);
        }
    }

}
