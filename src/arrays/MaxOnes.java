package arrays;

public class MaxOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int max = 0, count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
