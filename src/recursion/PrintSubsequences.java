package recursion;

public class PrintSubsequences {
    public static void main(String[] args) {
        printSubsequences("abc");
    }
    static void printSubsequences(String input) {
        helper(input.toCharArray(), 0, input.length());
    }
    static void helper(char[] input, int i, int n) {
        if(i >= n) {
            for(int j = i; j < n; j++)
                System.out.print(input[i]);
            System.out.println();
        }
        helper(input, i+1, n);
    }
}
