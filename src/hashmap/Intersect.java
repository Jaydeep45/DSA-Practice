package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect {
    public static void main(String[] args) {

    }
    static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num: nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for(int num: nums2) {
            if(map.containsKey(num)) {
                for(int i = 0; i < map.get(num); i++)
                    res.add(num);
            }
        }
        int[] resArray = new int[res.size()];
        int index = 0;
        for(int r: res)
            resArray[index++] = r;
        return resArray;
    }
}
