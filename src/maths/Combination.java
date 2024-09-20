package maths;

public class Combination {
    public static void main(String[] args) {
        int n = 7, r = 3;
        System.out.println(combination(n,r));
        System.out.println(fact(n)/(fact(r)*fact(n-r)));
    }
    private static int combination(int n, int r) {
        int deno = 1, num = 1;
        for(int i = 1; i <= r; i++) {
            deno *= i;
            num *= n--;
        }
        return num/deno;
    }
    private static int fact(int n) {
        if(n == 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
