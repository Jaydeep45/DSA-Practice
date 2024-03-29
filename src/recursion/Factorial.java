package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static long factorial(int n) {
        if(n < 0)
            throw new RuntimeException();
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
}
