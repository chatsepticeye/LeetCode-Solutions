class Solution {
    public int pivotInteger(int n) {
        // Calculate the total sum from 1 to n
        int totalSum = n * (n + 1) / 2;
        
        // Check if the total sum is a perfect square
        int x = (int) Math.sqrt(totalSum);
        
        if (x * x == totalSum) {
            return x;
        }
        
        return -1;
    }
}