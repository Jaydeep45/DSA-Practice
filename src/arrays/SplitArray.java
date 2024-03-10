package arrays;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
//        System.out.println(isPossibleToSplit(new int[] {1,1,2,2,3,4}));
        System.out.println(minOperations(new int[] {1000000000,999999999,1000000000,999999999,1000000000,999999999}, 1000000000));
    }
    static boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key: map.keySet()) {
            if(map.get(key) > 2)
                return false;
        }

        return true;
    }

    static int minOperations(int[] nums, int k) {
            Arrays.sort(nums);
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for (int num : nums) {
                pq.offer((long) num);
            }
            int operations = 0;
            while (pq.peek() < k && pq.size() >= 2) {
                long x = pq.poll();
                long y = pq.poll();
                long newValue = Math.min(x, y) * 2 + Math.max(x, y);
                pq.offer(newValue);
                operations++;
            }
            return  operations;
    }
    static int[] resultArray(int[] nums) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(nums[0]);
        stack2.push(nums[1]);
        int i = 2;
        while(i < nums.length) {
            if(greaterCount(stack1, nums[i]) > greaterCount(stack2, nums[i])) {
                stack1.push(nums[i]);
            } else if (greaterCount(stack1, nums[i]) == greaterCount(stack2, nums[i])) {
                if(stack1.size() <= stack2.size())
                    stack1.push(nums[i]);
                else
                    stack2.push(nums[i]);
            } else
                stack2.push(nums[i]);
            i++;
        }
        int[] res = new int[nums.length];
        i = 0;
        for(int s: stack1)
            res[i++] = s;
        for(int s: stack2)
            res[i++] = s;
        return res;
    }
    static int greaterCount(Stack<Integer> stack, int num) {
        int count = 0;
        for (int s : stack) {
            if(s > num)
                count++;
        }
        return count;
    }
}
