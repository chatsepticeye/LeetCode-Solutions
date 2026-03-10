class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        
        for (int num : nums) {
            // 1. Add the full number to the element sum
            elementSum += num;
            
            // 2. Break the number down into single digits
            while (num > 0) {
                digitSum += num % 10; // Grabs the last digit
                num /= 10;            // Chops off the last digit
            }
        }
        
        // 3. Return the absolute difference
        return Math.abs(elementSum - digitSum);
    }
}