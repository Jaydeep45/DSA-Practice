package bitmanipulations;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(List<Integer> list: subsets(arr)) {
            System.out.println(list.toString());
        }
    }
    static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < (1<<n); i++) {
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if((i & (1 << j)) > 0)
                    subset.add(nums[j]);
            }
            res.add(subset);
        }
        return res;
    }
}
