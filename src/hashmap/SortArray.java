package hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class SortArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6})));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : arr1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int[] res = new int[arr1.length];
        int i = 0;
        for (int a : arr2) {
            while (map.get(a) != 0) {
                res[i++] = a;
                map.put(a, map.get(a) - 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) != 0) {
                while (map.get(key) != 0) {
                    res[i++] = key;
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        return res;
    }
}
