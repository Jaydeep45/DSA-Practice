package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
       reverseNumber(123);
    }
    private static void reverseNumber(int n) {
        if(n == 0)
            return;
        System.out.print(n % 10);
        reverseNumber(n/10);
    }
}
