package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void main(String[] args) {
        printSubsequences("abc", new ArrayList<>(), 0);
    }
    static void printSubsequences(String input, List<Character> list, int index) {
        if(index == input.length()) {
            list.forEach(System.out::println);
            return;
        }
        list.add(input.charAt(index));
        printSubsequences(input, list, index+1);
        list.remove(input.charAt(index));
        printSubsequences(input, list, index + 1);
    }
}
