package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class HighestEvenElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[] {0,1,2,2,4,4,1}));
    }
    static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int num: nums) {
            if((num & 1) == 0)
                map.put(num, map.getOrDefault(num, 0)+1);
        }
        int res = -1, max = Integer.MIN_VALUE;
        for(int key: map.keySet()) {
            if(max < map.get(key))
                res = key;
        }
        return res;
    }
}
