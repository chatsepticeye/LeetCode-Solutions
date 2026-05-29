class Solution {
    public String largestOddNumber(String num) {
        // Scan from right to left to find the rightmost odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            
            // Check if the character is an odd digit
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                // Return the substring from the beginning up to this character (inclusive)
                return num.substring(0, i + 1);
            }
        }
        
        // If no odd digit is found, return an empty string
        return "";
    }
}