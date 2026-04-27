class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int n : nums) {
            if (n == 0) {
                // Any number multiplied by 0 is 0
                return 0;
            }
            if (n < 0) {
                // Keep track of how many negatives we have
                negativeCount++;
            }
        }

        // If negativeCount is even, product is positive (1)
        // If negativeCount is odd, product is negative (-1)
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}
