package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar ";
        int a = Integer.parseInt("-3245");
        System.out.println(isIsomorphic(s,t));

    }

    private static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(char c: s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        List<Integer> values1 = new ArrayList<>(map1.values());
        List<Integer> values2 = new ArrayList<>(map2.values());
        if(values1.size() != values2.size())
            return false;
        for(int i = 0; i < values1.size(); i++) {
            if(values1.get(i) != values2.get(i))
                return false;
        }
        return true;
    }
}
