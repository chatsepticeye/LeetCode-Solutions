class Solution {
    public int sumOfMultiples(int n) {
        int totalSum = 0;

        // Iterate through the range [1, n]
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by 3, 5, or 7
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                totalSum += i;
            }
        }

        return totalSum;
    }
}