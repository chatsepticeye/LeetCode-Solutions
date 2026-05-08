class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            // Check Primary Diagonal: nums[i][i]
            if (isPrime(nums[i][i])) {
                maxPrime = Math.max(maxPrime, nums[i][i]);
            }
            
            // Check Secondary Diagonal: nums[i][n - 1 - i]
            if (isPrime(nums[i][n - 1 - i])) {
                maxPrime = Math.max(maxPrime, nums[i][n - 1 - i]);
            }
        }

        return maxPrime;
    }

    // Standard optimized Prime Check
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check divisors up to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}