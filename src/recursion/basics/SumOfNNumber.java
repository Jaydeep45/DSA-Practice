package recursion.basics;

public class SumOfNNumber {
    public static void main(String[] args) {
        System.out.println(sumOfNNumber(10));
    }
    private static int sumOfNNumber(int n) {
        if(n == 0)
            return 0;
        return n + sumOfNNumber(n-1);
    }
}
