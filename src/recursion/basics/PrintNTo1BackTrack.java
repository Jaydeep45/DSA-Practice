package recursion.basics;

public class PrintNTo1BackTrack {
    public static void main(String[] args) {
        printNtoBackTrack(3,1);
    }

    private static void printNtoBackTrack(int n, int i) {
        if(n < i)
            return;
        printNtoBackTrack(n, i+1);
        System.out.println(i);
    }
}
