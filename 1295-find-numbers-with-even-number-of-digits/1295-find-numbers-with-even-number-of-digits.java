class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Convert to string and check if length is even
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}