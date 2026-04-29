class Solution {
    public boolean isSameAfterReversals(int num) {
        // If the number is 0, it stays 0 after any number of reversals.
        // For any other number, it must not end in a zero to remain the same.
        if (num == 0) {
            return true;
        }
        
        // Check if the last digit is zero
        return num % 10 != 0;
    }
}