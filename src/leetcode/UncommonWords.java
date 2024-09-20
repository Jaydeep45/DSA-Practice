package leetcode;

import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }
    static String[] uncommonFromSentences(String s1, String s2) {
        String[] sa1 = s1.split(" ");
        String[] sa2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String s: sa1)
            map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s: sa2)
            map.put(s, map.getOrDefault(s, 0) + 1);
        List<String> list = new ArrayList<>();
        for(String s: map.keySet())
            if(map.get(s) == 1)
                list.add(s);
        return list.toArray(new String[0]);
    }
}
