class Solution {
    public int[][] transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        // 1. Create a new "Warehouse" with swapped dimensions
        int[][] res = new int[cols][rows];
        
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                // 2. Map the old inventory to the new location
                res[j][i] = mat[i][j];
            }
        }
        
        // 3. Deliver the final product
        return res;
    }
}