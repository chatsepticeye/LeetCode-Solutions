class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            // A number even and divisible by 3 is simply a multiple of 6
            if (num % 6 == 0) {
                sum += num;
                count++;
            }
        }

        // If no numbers were found, return 0 to avoid division by zero
        // Otherwise, return the integer division (which naturally rounds down)
        return count == 0 ? 0 : sum / count;
    }
}