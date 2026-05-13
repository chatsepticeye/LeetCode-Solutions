class Solution {
    public int minMoves(int[] nums) {
        int maxVal = nums[0];
        int totalMoves = 0;

        // 1. Find the maximum value in the array
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        // 2. Calculate the moves needed for each element
        for (int num : nums) {
            totalMoves += (maxVal - num);
        }

        return totalMoves;
    }
}