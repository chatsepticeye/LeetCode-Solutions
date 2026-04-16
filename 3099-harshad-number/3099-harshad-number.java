class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumOfDigits = 0;
        int temp = x;

        // Extract digits and sum them up
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if x is divisible by its digit sum
        if (x % sumOfDigits == 0) {
            return sumOfDigits;
        }

        return -1;
    }
}