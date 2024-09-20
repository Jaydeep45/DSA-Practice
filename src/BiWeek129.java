import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BiWeek129 {
    public static void main(String[] args) {
        String s = "1 2 32 405 5567";
        System.out.println(binarySearch(s, 32));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        List<Integer> list = new ArrayList<>(set);
    }
    static boolean binarySearch(String s, int n) {
        int low = 0, high = s.length() - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(!Character.isDigit(s.charAt(mid)))
                mid--;
            int start = mid;
            String num = "";
            while(start >= 0 &&Character.isDigit(s.charAt(start))) {
                num = s.charAt(start--) + num;
            }
            start = mid+1;
            while(start < s.length() && Character.isDigit(s.charAt(start)))
                num += s.charAt(start++);
            int number = Integer.parseInt(num);
            if(number == n)
                return true;
            else if(number > n)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

}