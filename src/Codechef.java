import java.util.Scanner;

public class Codechef {
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0) {
            long x = sc.nextLong();
            int count = countXORPairs(x);

            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println(1);
            }
        }
    }
    private static int countXORPairs(long x) {
        int count = 0;

        for (long a = 1; a <= x; a++) {
            long b = x ^ a;
            if (a <= b && b <= x) {
                count++;
            }
        }

        return count;
    }
}
