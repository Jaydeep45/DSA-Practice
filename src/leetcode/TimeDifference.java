package leetcode;
import java.util.*;

public class TimeDifference {
    public static void main(String[] args) {
        System.out.println(findMinDifference(new ArrayList<>(List.of("00:00","04:00","22:00"))));
    }
    static int findMinDifference(List<String> timePoints) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < timePoints.size(); i++) {
            if(timePoints.get(i).equals("00:00"))
                timePoints.set(i, "24:00");
        }
        Collections.sort(timePoints);
        for(int i = 1; i < timePoints.size(); i++) {
            String[] split1 = timePoints.get(i).split(":");
            int hour1 = Integer.parseInt(split1[0]);
            int min1 = Integer.parseInt(split1[1]);
            int total1 = hour1 * 60 + min1;
            String[] split2 = timePoints.get(i-1).split(":");
            int hour2 = Integer.parseInt(split2[0]);
            int min2 = Integer.parseInt(split2[1]);
            int total2 = hour2 * 60 + min2;
            min = Math.min(min, Math.abs(total1-total2));
        }
        String[] split1 = timePoints.get(0).split(":");
        int hour1 = Integer.parseInt(split1[0]);
        int min1 = Integer.parseInt(split1[1]);
        int total1 = hour1 * 60 + min1;
        String[] split2 = timePoints.get(timePoints.size()-1).split(":");
        int hour2 = Integer.parseInt(split1[0]);
        int min2 = Integer.parseInt(split1[1]);
        int total2 = hour1 * 60 + min1;
        min = Math.min(min, Math.abs(total1-total2));
        return min;
    }
}
