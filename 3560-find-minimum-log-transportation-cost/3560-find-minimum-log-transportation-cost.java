class Solution {
    public long minCuttingCost(int n, int m, int k) {
        // Base Case: Both logs already fit in the trucks perfectly
        if (n <= k && m <= k) {
            return 0;
        }
        
        long costIfWeCutN = Long.MAX_VALUE;
        long costIfWeCutM = Long.MAX_VALUE;
        
        // Scenario 2: Try cutting log N into two pieces: 'k' and 'n - k'
        // This is only valid if log M fits, and the remaining piece (n - k) fits
        if (m <= k && (n - k) <= k) {
            costIfWeCutN = (long) k * (n - k);
        }
        
        // Scenario 3: Try cutting log M into two pieces: 'k' and 'm - k'
        // This is only valid if log N fits, and the remaining piece (m - k) fits
        if (n <= k && (m - k) <= k) {
            costIfWeCutM = (long) k * (m - k);
        }
        
        // Find the minimum valid cost
        long minCost = Math.min(costIfWeCutN, costIfWeCutM);
        
        // If minCost is still Long.MAX_VALUE, it means it's impossible to fit them
        return minCost == Long.MAX_VALUE ? -1 : minCost;
    }
}