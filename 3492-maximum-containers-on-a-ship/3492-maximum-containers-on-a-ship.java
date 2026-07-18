class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        // 1. Calculate the total available slots on the deck
        int totalSlots = n * n;
        
        // 2. Calculate the maximum containers allowed by weight
        int maxAllowedByWeight = maxWeight / w;
        
        // 3. The answer is the smaller of the two restrictions
        return Math.min(totalSlots, maxAllowedByWeight);
    }
}