class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // Priority 1: Take the 1s
        if (k <= numOnes) {
            return k;
        }
        
        // Priority 2: Take the 0s (sum doesn't change)
        if (k <= numOnes + numZeros) {
            return numOnes;
        }
        
        // Priority 3: Forced to take the -1s
        int remainingItemsToPick = k - (numOnes + numZeros);
        return numOnes - remainingItemsToPick;
    }
}