class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // 1. Get total sum
        for (int num : nums) totalSum += num;
        
        // 2. Iterate and check
        for (int i = 0; i < nums.length; i++) {
            // rightSum = totalSum - leftSum - currentElement
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}