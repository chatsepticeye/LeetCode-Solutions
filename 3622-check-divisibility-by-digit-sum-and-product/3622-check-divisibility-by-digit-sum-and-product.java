class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum = 0;
        int digitProduct = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            digitProduct *= digit;
            temp /= 10;
        }

        int total = digitSum + digitProduct;
        
        // Ensure we don't divide by zero, although for n > 0 
        // the sum + product will always be at least 1.
        return n % total == 0;
    }
}