class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isValid(i)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check each number
    private boolean isValid(int num) {
        boolean changed = false;
        while (num > 0) {
            int digit = num % 10;
            
            // 3, 4, 7 make the whole number invalid
            if (digit == 3 || digit == 4 || digit == 7) return false;
            
            // 2, 5, 6, 9 must appear at least once to make it "different"
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                changed = true;
            }
            
            num /= 10;
        }
        return changed;
    }
}