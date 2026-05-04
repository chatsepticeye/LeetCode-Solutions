class Solution {
    public int distinctIntegers(int n) {
        // If n is 1, the only number on the board is 1.
        // For any n > 1, all numbers from 2 to n will eventually be added.
        return (n == 1) ? 1 : n - 1;
    }
}