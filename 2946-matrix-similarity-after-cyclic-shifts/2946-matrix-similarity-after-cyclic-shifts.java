class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        // A shift of k is the same as a shift of k % n
        k %= n;
        
        // If k is 0 or a multiple of n, no change actually happens
        if (k == 0) return true;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // For the row to be identical after k shifts, 
                // every element must match the element k positions away.
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}