public class LeetCodeContest386 {
    public static void main(String[] args) {
//        System.out.println(largestSquareArea(new int[][] {{1,1},{3,3},{3,1}}, new int[][]{{2,2},{4,4},{4,2}}));
        System.out.println(earliestSecondToMarkIndices(new int[] {0,0,1,2}, new int[] {1,2,1,2,1,2,1,2}));

    }

    static int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        int n = nums.length;
        int m = changeIndices.length;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            } else {
                count += 2;
            }
        }
        if(count > m)
            return -1;
        else
            return count;
    }
        static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int largestArea = 0;

        // Iterate through all pairs of rectangles
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i + 1; j < bottomLeft.length; j++) {
                // Find the intersecting region
                int left = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int right = Math.min(topRight[i][0], topRight[j][0]);
                int bottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int top = Math.min(topRight[i][1], topRight[j][1]);

                // Check if the region has positive side length
                if (left < right && bottom < top) {
                    // Calculate the area of the square that fits
                    int sideLength = Math.min(right - left, top - bottom);
                    int area = sideLength * sideLength;

                    // Update the largest area if bigger
                    largestArea = Math.max(largestArea, area);
                }
            }
        }

        return largestArea;
    }
}
