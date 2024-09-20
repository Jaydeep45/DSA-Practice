public class LeetCodeBi127 {
    public static void main(String[] args) {
        LeetCodeBi127 bi = new LeetCodeBi127();
        System.out.println(bi.minimumSubarrayLength(new int[] {2,1}, 0));
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int result = Integer.MAX_VALUE;
        int currOr = 0;

        for (int right = 0; right < n; right++) {
            currOr |= nums[right];
            while (currOr >= k) {
                result = Math.min(result, right - left + 1);
                currOr &= ~nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
    public int minimumLevels(int[] possible) {
        int left = 0, right = possible.length - 1;
        return  - 1;
    }
}
