package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[] {3,2,1,5,6,4}, 2));
        System.out.println(findKthSmallest(new int[] {3,2,1,5,6,4}, 5));
    }
    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num: nums) {
            queue.add(num);
            if(queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
    static int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) {
            queue.add(num);
            if(queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
}
