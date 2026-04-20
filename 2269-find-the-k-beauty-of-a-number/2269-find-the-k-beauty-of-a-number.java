class Solution {
    public int divisorSubstrings(int num, int k) {
        // Convert the number to a string to easily extract substrings
        String s = String.valueOf(num);
        int count = 0;
        
        // Iterate through the string until we can no longer form a substring of length k
        for (int i = 0; i <= s.length() - k; i++) {
            // Extract the substring of length k
            String sub = s.substring(i, i + k);
            
            // Convert the substring back to an integer
            int divisor = Integer.parseInt(sub);
            
            // Condition 1: The divisor cannot be 0
            // Condition 2: The divisor must divide the original num
            if (divisor != 0 && num % divisor == 0) {
                count++;
            }
        }
        
        return count;
    }
}