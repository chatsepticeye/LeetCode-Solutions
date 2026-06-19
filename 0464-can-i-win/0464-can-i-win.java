import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        // Edge Case 1: Direct win on first move
        if (maxChoosableInteger >= desiredTotal) return true;
        
        // Edge Case 2: Total pool sum is too small to ever reach target
        int totalPoolSum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (totalPoolSum < desiredTotal) return false;
        
        // Memoization map to store: key (bitmask state) -> value (can win true/false)
        Map<Integer, Boolean> memo = new HashMap<>();
        
        // Start the recursive game tracking with an empty bitmask (0)
        return helper(maxChoosableInteger, desiredTotal, 0, memo);
    }
    
    private boolean helper(int maxChoosable, int remainingTotal, int state, Map<Integer, Boolean> memo) {
        // If we have already evaluated this exact pool distribution before, return the cached result
        if (memo.containsKey(state)) {
            return memo.get(state);
        }
        
        // Try picking every available integer from 1 to maxChoosable
        for (int i = 1; i <= maxChoosable; i++) {
            int mask = 1 << i;
            
            // Check if number 'i' is unchosen (the bit is 0)
            if ((state & mask) == 0) {
                // Choice A: If picking 'i' instantly wins the game
                if (i >= remainingTotal) {
                    memo.put(state, true);
                    return true;
                }
                
                // Choice B: Pick 'i' and check if it forces the opponent to lose
                // We flip the bit to 1 using (state | mask) to mark 'i' as used
                if (!helper(maxChoosable, remainingTotal - i, state | mask, memo)) {
                    memo.put(state, true);
                    return true;
                }
            }
        }
        
        // If no move leads to a forced win, this state is a guaranteed loss
        memo.put(state, false);
        return false;
    }
}