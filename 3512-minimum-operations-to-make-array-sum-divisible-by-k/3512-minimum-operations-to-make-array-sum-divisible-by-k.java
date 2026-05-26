class Solution {
    public int minOperations(int[] nums, int k) {
        long totalSum = 0;
        
        // Step 1: Compute the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Step 2: Calculate how many operations are needed to reach the divisible multiple beneath it
        int remainder = (int) (totalSum % k);
        
        return remainder;
    }
}