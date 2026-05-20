class Solution {
    public String maximumOddBinaryNumber(String s) {
        int onesCount = 0;
        int zerosCount = 0;
        
        // Count the number of 1s and 0s
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                onesCount++;
            } else {
                zerosCount++;
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        // Append all remaining 1s except the one locked at the end
        for (int i = 0; i < onesCount - 1; i++) {
            result.append('1');
        }
        
        // Append all the 0s in the middle
        for (int i = 0; i < zerosCount; i++) {
            result.append('0');
        }
        
        // Append the locked 1 at the very end to ensure it's odd
        result.append('1');
        
        return result.toString();
    }
}