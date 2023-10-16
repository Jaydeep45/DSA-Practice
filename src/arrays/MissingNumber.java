package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5};
        int n = arr.length;
        int requiredSum = n * (n+1) / 2, sum = 0;
        for(int a: arr)
            sum += a;
        System.out.println(requiredSum - sum);
    }
}
