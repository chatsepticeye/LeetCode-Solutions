class Solution {
    public boolean isFascinating(int n) {
        // Step 1: Concatenate n, 2*n, and 3*n
        String concat = "" + n + (2 * n) + (3 * n);
        
        // Step 2: Since we need digits 1-9 exactly once, total length must be 9
        if (concat.length() != 9) {
            return false;
        }
        
        // Step 3: Check frequency of each digit
        int[] freq = new int[10];
        for (char c : concat.toCharArray()) {
            int digit = c - '0';
            
            // If it contains '0' or a digit repeats, it's not fascinating
            if (digit == 0 || freq[digit] > 0) {
                return false;
            }
            freq[digit]++;
        }
        
        return true;
    }
}