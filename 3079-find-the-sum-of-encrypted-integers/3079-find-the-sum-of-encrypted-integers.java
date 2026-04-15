class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += encrypt(num);
        }
        return totalSum;
    }

    private int encrypt(int x) {
        int maxDigit = 0;
        int digitCount = 0;
        int temp = x;
        
        // Step 1: Find the max digit and count total digits
        while (temp > 0) {
            int currentDigit = temp % 10;
            maxDigit = Math.max(maxDigit, currentDigit);
            digitCount++;
            temp /= 10;
        }
        
        // Step 2: Build the encrypted number (e.g., if max is 5 and count is 3, build 555)
        int encryptedValue = 0;
        while (digitCount > 0) {
            encryptedValue = encryptedValue * 10 + maxDigit;
            digitCount--;
        }
        
        return encryptedValue;
    }
}