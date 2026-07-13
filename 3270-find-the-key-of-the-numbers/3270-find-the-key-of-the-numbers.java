class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        int placeValue = 1; // Tracks 1, 10, 100, 1000
        
        // The problem guarantees we evaluate exactly 4 positions
        for (int i = 0; i < 4; i++) {
            // 1. Extract the last digit of each number
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num3 % 10;
            
            // 2. Find the smallest digit among the three
            int minDigit = Math.min(d1, Math.min(d2, d3));
            
            // 3. Build the key by adding the digit at its correct place value
            key += minDigit * placeValue;
            
            // 4. Shift all numbers right by chopping off the last digit
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            
            // Move to the next place value position (e.g., from ones to tens)
            placeValue *= 10;
        }
        
        return key; // Automatically returns without leading zeros because it's an int!
    }
}