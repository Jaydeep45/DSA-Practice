package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int low = 0, high = arr.length, index = -1, target = 9;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] <= target) {
                index = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        int binaryIndex = binarySearch(arr,0, arr.length  - 1, 5);
        System.out.println(arr[index]);
        System.out.println("Recursion: " + arr[binaryIndex]);
    }
    private static int binarySearch(int[] arr, int low, int high, int target) {
        int mid = low + (high - low) / 2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        }
        else
            return binarySearch(arr, mid + 1, high, target);
    }
}
