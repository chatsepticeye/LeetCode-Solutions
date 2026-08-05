class Solution {
    public String largestEven(String s) {
        // Search from the end towards the beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';
            // Check if the current digit is even
            if (digit % 2 == 0) {
                return s.substring(0, i + 1);
            }
        }
        return ""; // Return empty string if no even digit is found
    }
}