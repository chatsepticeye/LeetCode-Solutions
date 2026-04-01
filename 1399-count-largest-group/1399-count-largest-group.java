class Solution {
    public int countLargestGroup(int n) {
        int[] counts = new int[37]; // Max sum for n=10000 is 9+9+9+9=36
        int maxSize = 0;
        
        for (int i = 1; i <= n; i++) {
            int sum = getDigitSum(i);
            counts[sum]++;
            maxSize = Math.max(maxSize, counts[sum]);
        }
        
        int result = 0;
        for (int count : counts) {
            if (count == maxSize) {
                result++;
            }
        }
        return result;
    }
    
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}