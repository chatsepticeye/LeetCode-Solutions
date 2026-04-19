class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            // Check if the current number is even
            if (num % 2 == 0) {
                num /= 2; // Divide by 2
            } else {
                num -= 1; // Subtract 1 if odd
            }
            // Increment the step counter after each operation
            steps++;
        }
        
        return steps;
    }
}