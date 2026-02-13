
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        // The Outer Loop (Pick a number)
        for (int i = 0; i < nums.length; i++) {
            // The Inner Loop (Compare it with everyone AFTER it)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}