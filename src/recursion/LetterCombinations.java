package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("23"));
    }
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, new ArrayList<>(){{
            add("a");
            add("b");
            add("c");
        }});
        map.put(3, new ArrayList<>(){{
            add("d");
            add("e");
            add("f");
        }});
        map.put(4, new ArrayList<>(){{
            add("g");
            add("h");
            add("i");
        }});
        map.put(5, new ArrayList<>(){{
            add("j");
            add("k");
            add("l");
        }});
        map.put(6, new ArrayList<>(){{
            add("m");
            add("n");
            add("o");
        }});
        map.put(7, new ArrayList<>(){{
            add("p");
            add("q");
            add("r");
            add("s");
        }});
        map.put(8, new ArrayList<>(){{
            add("t");
            add("u");
            add("v");
        }});
        map.put(9, new ArrayList<>(){{
            add("w");
            add("x");
            add("y");
            add("z");
        }});

        for(int i = 0; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            System.out.println(digit);
        }

        return new ArrayList<>();
    }
}
