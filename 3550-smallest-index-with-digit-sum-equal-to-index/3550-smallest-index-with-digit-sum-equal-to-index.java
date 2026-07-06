class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        
        // Loop through the array from left to right (ensures we get the smallest index first)
        for (int i = 0; i < n; i++) {
            // Check if the digit sum of the current number equals the current index
            if (getDigitSum(nums[i]) == i) {
                return i; // Found it! Return the index immediately
            }
        }
        
        // If the loop finishes and no match is found, return -1
        return -1;
    }
    
    // Helper method to split a number and calculate its digit sum
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Grab the last digit
            num = num / 10;  // Discard the last digit
        }
        return sum;
    }
}