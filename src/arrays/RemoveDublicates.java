package arrays;

import java.util.Arrays;

public class RemoveDublicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3,};
        int i = 0, j = 1;
        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                j++;
            } else {
                int k = j;
                while (k < arr.length) {
                    arr[k - 1] = arr[k];
                    k++;
                }
                // Update i and j to the next unique element
                i++;
                j = i + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
