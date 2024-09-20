package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        int res = sumOfDigits(n);
        System.out.println(res);
    }

    private static int sumOfDigits(int n) {
        if(n < 10)
            return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
