class Solution {
    public int distributeCandies(int n, int limit) {
        // Total ways without restrictions
        long total = nCr2(n + 2);
        
        // Ways where 1 child violates the limit
        long violateOne = 3 * nCr2(n - (limit + 1) + 2);
        
        // Ways where 2 children violate the limit
        long violateTwo = 3 * nCr2(n - 2 * (limit + 1) + 2);
        
        // Ways where all 3 children violate the limit
        long violateThree = nCr2(n - 3 * (limit + 1) + 2);
        
        // Inclusion-Exclusion Principle formula
        return (int) (total - violateOne + violateTwo - violateThree);
    }
    
    // Helper function to calculate x choose 2 safely
    private long nCr2(int x) {
        if (x < 2) return 0;
        return (long) x * (x - 1) / 2;
    }
}