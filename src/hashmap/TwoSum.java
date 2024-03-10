package hashmap;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int diff = t - nums[i];
            if(map.containsKey(diff)) {
                res[0] = map.get(diff);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(res));
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> list = new HashSet<>();
        for(int num: nums1)
            set.add(num);
        for(int num: nums2) {
            if(set.contains(num))
                list.add(num);
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int n: list)
            res[i++] = n;
        return res;
    }
}
