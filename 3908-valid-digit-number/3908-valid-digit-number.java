class Solution {
    public boolean validDigit(int n, int x) {
        // Convert both the number and digit to strings for easy checking
        String numStr = String.valueOf(n);
        String digitStr = String.valueOf(x);
        
        // Condition 1: It must contain the digit x
        if (!numStr.contains(digitStr)) {
            return false;
        }
        
        // Condition 2: It must NOT start with the digit x
        if (numStr.startsWith(digitStr)) {
            return false;
        }
        
        // If it passes both checks, it's valid!
        return true;
    }
}