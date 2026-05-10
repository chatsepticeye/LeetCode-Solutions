class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int reversed = 0;
        
        // Logic to reverse the integer
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        
        // Return absolute difference
        return Math.abs(original - reversed);
    }
}