class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            // Get the last digit
            int digit = temp % 10;
            
            // Check if the original number is divisible by this digit
            if (num % digit == 0) {
                count++;
            }
            
            // Remove the last digit
            temp /= 10;
        }

        return count;
    }
}