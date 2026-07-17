class Solution {
    public int[] getNoZeroIntegers(int n) {
        // Try every possible value for 'a' starting from 1
        for (int a = 1; a < n; a++) {
            int b = n - a;
            
            // If neither 'a' nor 'b' contains a zero, we found our pair!
            if (!hasZero(a) && !hasZero(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // Fallback
    }
    
    // A helper method to check if a number contains the digit 0
    private boolean hasZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true; // Found a zero at the end of the number
            }
            num /= 10; // Chop off the last digit and keep checking
        }
        return false;
    }
}