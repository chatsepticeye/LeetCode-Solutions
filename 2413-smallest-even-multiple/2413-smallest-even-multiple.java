class Solution {
    public int smallestEvenMultiple(int n) {
        // If n is even, return n. If n is odd, return n * 2.
        return (n % 2 == 0) ? n : n * 2;
    }
}