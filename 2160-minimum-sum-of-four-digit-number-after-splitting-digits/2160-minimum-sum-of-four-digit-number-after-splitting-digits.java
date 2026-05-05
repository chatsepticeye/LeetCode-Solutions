import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        
        // Extract digits
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        
        // Sort digits ascending
        Arrays.sort(digits);
        
        // new1 = digits[0]digits[2], new2 = digits[1]digits[3]
        return (digits[0] * 10 + digits[2]) + (digits[1] * 10 + digits[3]);
    }
}