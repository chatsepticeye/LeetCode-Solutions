public class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        
        // 1. Compute the total sum of the entire array
        for (int num : nums) {
            totalSum += num;
        }
        
        // 2. If the total sum is odd, no partition can have an even difference
        if (totalSum % 2 != 0) {
            return 0;
        }
        
        // 3. If total sum is even, all possible (n - 1) partitions are valid
        return n - 1;
    }
}