class Solution {
    public int alternateDigitSum(int n) {
        int res = 0;
        int sign = 1;
        
        while (n > 0) {
            int digit = n % 10;
            // We flip the sign logic: result = digit - previous_result
            res = digit - res;
            n /= 10;
        }
        
        return res;
    }
}