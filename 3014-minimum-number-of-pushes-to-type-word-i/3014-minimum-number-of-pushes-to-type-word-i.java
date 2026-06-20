class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int totalPushes = 0;
        
        // Track the current position slot multiplier (1st press, 2nd press, etc.)
        int pressCost = 1; 
        
        while (n > 0) {
            if (n >= 8) {
                // If we have at least 8 letters left, fill up the current press slot across all 8 keys
                totalPushes += 8 * pressCost;
                n -= 8;
            } else {
                // If fewer than 8 letters remain, they all take the current press cost slot
                totalPushes += n * pressCost;
                n = 0;
            }
            // Move to the next slot layer (e.g., from 1 push to 2 pushes per key)
            pressCost++;
        }
        
        return totalPushes;
    }
}

