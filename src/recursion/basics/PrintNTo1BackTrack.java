package recursion.basics;

public class PrintNTo1BackTrack {
    public static void main(String[] args) {
        printNtoBackTrack(3,1);
        printNto1(3);
    }

    private static void printNto1(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }

    private static void printNtoBackTrack(int n, int i) {
        if(n < i)
            return;
        printNtoBackTrack(n, i+1);
        System.out.println(i);
    }
}
