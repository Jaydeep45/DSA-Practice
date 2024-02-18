package arrays;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                int j = i+1;
                while(j < arr.length && arr[j] !=0 ) {
                    j++;
                }
                for(int k = i; k < j - 1; k++) {
                    arr[k] = arr[k+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
