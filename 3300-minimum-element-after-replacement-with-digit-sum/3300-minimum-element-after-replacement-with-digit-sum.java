class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE;

        for (int num : nums) {
            int currentDigitSum = getDigitSum(num);
            
            if (currentDigitSum < minSum) {
                minSum = currentDigitSum;
            }
        }

        return minSum;
    }

    private int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}