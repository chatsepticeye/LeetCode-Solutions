class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Handle cases where k is larger than the array size
        k = k % n; 
        
        // Step 1: Reverse the entire "Warehouse" (Array)
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements to fix their order
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining elements to fix their order
        reverse(nums, k, n - 1);
    }
    
    // The "Two-Pointer" helper function we mastered
    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            
            left++;
            right--;
        }
    }
}