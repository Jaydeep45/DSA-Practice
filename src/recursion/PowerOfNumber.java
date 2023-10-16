package recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 2, p = 20;
        long powerOfNumber = powerOfNumber(n,p);
        System.out.println(powerOfNumber);
    }

    private static long powerOfNumber(int n, int p) {
        if(p == 1)
            return n;
        return n * powerOfNumber(n, p-1);
    }
}
