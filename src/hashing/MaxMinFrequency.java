package hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxMinFrequency {
    public static void main(String[] args) {
        int [] arr = {10,5,10,15,10,5};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i,map.getOrDefault(i, 0) + 1);
        }
        int maxValue = Integer.MIN_VALUE, maxKey = 0, minValue = Integer.MAX_VALUE, minKey = 0;
        for(int key: map.keySet()) {
            int value = map.get(key);
            if(value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
            if(value < minValue) {
                minKey = key;
                minValue = value;
            }
        }
        System.out.println(maxKey +" " + minKey);
    }
}
