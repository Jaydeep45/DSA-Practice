package binarysearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        System.out.println(findInMountainArray(3, new MountainArray()));
    }
    static int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int mid;
        if(length % 2 == 0)
            mid = length / 2 - 1;
        else
            mid = length / 2;
        int i = 0, j = mid;
        while(i <= j) {
            int midIndex =  i + (j - i) / 2;
            int midValue = mountainArr.get(midIndex);
            if(midValue == target)
                return midIndex;
            else if(target > midValue)
                i = midIndex + 1;
            else
                j = midIndex - 1;
        }
        i = mid + 1;
        j = length - 1;
        while(i <= j) {
            int midIndex = i + (j - i) / 2;
            int midValue = mountainArr.get(midIndex);
            if(midValue == target)
                return midIndex;
            else if(target < midValue)
                i = midIndex + 1;
            else
                j = midIndex - 1;
        }
        return -1;
    }
}

class  MountainArray {
    private final int[] array = new int[] {0,5,3,1};
    public int get(int index) {
        return array[index];
    }
    public int length() {
        return array.length;
    }
}
