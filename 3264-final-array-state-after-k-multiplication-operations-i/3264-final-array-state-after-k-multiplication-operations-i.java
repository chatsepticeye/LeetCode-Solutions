import java.util.PriorityQueue;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // Min-heap to store array elements as int[]{value, index}
        // It sorts primarily by value, and secondarily by index to handle ties
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        
        // Push all elements with their initial indices into the heap
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[]{nums[i], i});
        }
        
        // Perform k operations
        for (int i = 0; i < k; i++) {
            int[] curr = minHeap.poll();
            int val = curr[0];
            int idx = curr[1];
            
            // Update the value in the original array
            nums[idx] = val * multiplier;
            
            // Push the updated value back into the heap
            minHeap.offer(new int[]{nums[idx], idx});
        }
        
        return nums;
    }
}