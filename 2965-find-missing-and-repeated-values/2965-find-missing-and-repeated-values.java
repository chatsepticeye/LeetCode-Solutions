class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;
        
        // Sum of first N numbers: n(n+1)/2
        long expectedSum = N * (N + 1) / 2;
        // Sum of squares of first N numbers: n(n+1)(2n+1)/6
        long expectedSquareSum = N * (N + 1) * (2 * N + 1) / 6;
        
        long actualSum = 0;
        long actualSquareSum = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long val = grid[i][j];
                actualSum += val;
                actualSquareSum += (val * val);
            }
        }
        
        // diff1 = a - b
        long diff1 = actualSum - expectedSum;
        // diff2 = a^2 - b^2 = (a - b)(a + b)
        long diff2 = actualSquareSum - expectedSquareSum;
        
        // (a + b) = (a^2 - b^2) / (a - b)
        long sumOfAB = diff2 / diff1;
        
        // Now solve for a and b:
        // a = ((a + b) + (a - b)) / 2
        int a = (int) ((sumOfAB + diff1) / 2);
        // b = (a + b) - a
        int b = (int) (sumOfAB - a);
        
        return new int[]{a, b};
    }
}