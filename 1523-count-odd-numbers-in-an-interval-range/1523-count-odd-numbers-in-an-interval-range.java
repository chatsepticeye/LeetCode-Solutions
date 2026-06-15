class Solution {
    public int countOdds(int low, int high) {
        // Formula: Odds in [0, high] - Odds in [0, low - 1]
        int oddsUpToHigh = (high + 1) / 2;
        int oddsBeforeLow = (low) / 2; // (low - 1 + 1) / 2 simplifies to just low / 2
        
        return oddsUpToHigh - oddsBeforeLow;
    }
}