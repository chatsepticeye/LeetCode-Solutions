class Solution {
    public int minimumFlips(int n) {
        // Step 1: Get the binary string without leading zeros
        String s = Integer.toBinaryString(n);
        int flips = 0;
        int len = s.length();
        
        // Step 2: Compare s with its original reverse
        // We compare index i with (len - 1 - i) of the original string
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                flips++;
            }
        }
        
        return flips;
    }
}