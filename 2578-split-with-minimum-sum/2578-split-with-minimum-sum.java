import java.util.Arrays;

class Solution {
    public int splitNum(int num) {
        // 1. Convert the number to a string to easily extract digits
        String numStr = Integer.toString(num);
        char[] digits = numStr.toCharArray();
        
        // 2. Sort digits in ascending order
        Arrays.sort(digits);
        
        int num1 = 0;
        int num2 = 0;
        
        // 3. Alternate distributing digits between num1 and num2
        for (int i = 0; i < digits.length; i++) {
            int digitValue = digits[i] - '0'; // Convert char to int
            
            if (i % 2 == 0) {
                num1 = num1 * 10 + digitValue;
            } else {
                num2 = num2 * 10 + digitValue;
            }
        }
        
        // 4. Return the minimal combined sum
        return num1 + num2;
    }
}