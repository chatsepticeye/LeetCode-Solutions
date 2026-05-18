class Solution {
    public int smallestNumber(int n, int t) {
        // Keep incrementing n until we find a valid digit product
        while (true) {
            if (getDigitProduct(n) % t == 0) {
                return n;
            }
            n++;
        }
    }

    // Helper method to extract digits and calculate their product
    private int getDigitProduct(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10); // Grab the last digit
            num /= 10;             // Remove the last digit
        }
        return product;
    }
}