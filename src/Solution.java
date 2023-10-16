import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int testCase = 1; testCase <= t; testCase++) {
            int n = sc.nextInt();
            long[] x = new long[n];
            for(int i = 0; i < n; i++)
                x[i] = sc.nextLong();
            Arrays.sort(x);
            double res = 0;
            int p = n / 2;
            double[] points = new double[p];
            if(n % 2 == 0) {
                int curr = 0;
                for(int i = 0; i < n; i += 2) {
                    points[curr++] = (double) (x[i] + x[i + 1]) / 2;
                }
                for (int i = 1; i < points.length; i++) {
                    res += Math.abs(points[i] - points[i - 1]);
                }
            } else {
                int curr = 1;
                points[0] = (double) (x[0] + x[2]) / 2;
                for(int i = 3; i < n; i += 2) {
                    points[curr++] = (double) (x[i] + x[i + 1]) / 2;
                }
                for (int i = 1; i < points.length; i++) {
                    res += Math.abs(points[i] - points[i - 1]);
                }
            }
            System.out.println("Case #" + testCase + ": " + res);
        }
    }


}
