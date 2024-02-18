package maths;

public class Power {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    static double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n < 0) {
            if(n % 2 == 0) {
                return myPow(x * x, n / 2);
            } else
                return 1 / x * myPow(x, n + 1);
        }
        else if(n % 2 == 0) {
            return myPow(x * x, n/2);
        }
        else {
            return x * myPow(x, n - 1);
        }
    }
}
