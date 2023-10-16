package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
}
