class Solution {
    public int countOperations(int num1, int num2) {
        int operations = 0;
        
        // Loop runs until either number drops to 0
        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2) {
                operations += num1 / num2; // Bulk add the number of subtractions
                num1 %= num2;              // Instantly reduce num1 to the remainder
            } else {
                operations += num2 / num1; // Bulk add the number of subtractions
                num2 %= num1;              // Instantly reduce num2 to the remainder
            }
        }
        
        return operations;
    }
}