package recursion.basics;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(3,1);
        print(3);
    }

    private static void print(int n) {
        if(n == 0)
            return;
        print(n-1);
        System.out.println(n);
    }

    private static void print1ToN(int n, int i) {
        if(n < i)
            return;
        System.out.println(i);
        print1ToN(n, i+1);
    }
}
