class Solution {
    public int maximum69Number (int num) {
        // Convert the integer to a String
        String numStr = String.valueOf(num);
        
        // Convert String to a character array for easy modification
        char[] digits = numStr.toCharArray();
        
        // Traverse from left to right
        for (int i = 0; i < digits.length; i++) {
            // The first 6 we encounter is the leftmost one
            if (digits[i] == '6') {
                digits[i] = '9';
                // We only change at most ONE digit, so we break immediately
                break;
            }
        }
        
        // Convert the character array back to an integer
        return Integer.parseInt(new String(digits));
    }
}

