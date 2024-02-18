package recursion.basics;

public class Print1ToN {
    public static void main(String[] args) {
        print1ToN(3,1);
    }

    private static void print1ToN(int n, int i) {
        if(n < i)
            return;
        System.out.println(i);
        print1ToN(n, i+1);
    }
}
