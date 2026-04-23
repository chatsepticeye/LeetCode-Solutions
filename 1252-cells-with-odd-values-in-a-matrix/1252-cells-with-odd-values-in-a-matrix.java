class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCounts = new int[m];
        int[] colCounts = new int[n];
        
        // Step 1: Count increments for each row and column
        for (int[] index : indices) {
            rowCounts[index[0]]++;
            colCounts[index[1]]++;
        }
        
        // Step 2: Count how many rows and columns have odd increment counts
        int oddRows = 0;
        for (int r : rowCounts) {
            if (r % 2 != 0) oddRows++;
        }
        
        int oddCols = 0;
        for (int c : colCounts) {
            if (c % 2 != 0) oddCols++;
        }
        
        // Step 3: Calculate total odd cells using math
        // A cell is odd if (row is odd AND col is even) OR (row is even AND col is odd)
        // evenRows = m - oddRows
        // evenCols = n - oddCols
        return oddRows * (n - oddCols) + oddCols * (m - oddRows);
    }
}