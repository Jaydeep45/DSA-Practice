package hashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next();
        String stones = sc.next();
        Set<Character> set = new HashSet<>();
        for(char jewel: jewels.toCharArray()) {
            set.add(jewel);
        }
        int res = 0;
        for(char stone: stones.toCharArray()) {
            if(set.contains(stone)) {
                res++;
            }
        }
        System.out.println(res  );
    }
}
