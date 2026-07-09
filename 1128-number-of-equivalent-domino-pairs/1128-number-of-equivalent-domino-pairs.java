class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        // Frequency array to store counts of normalized dominoes (keys 11 to 99)
        int[] counts = new int[100];
        int pairs = 0;
        
        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];
            
            // Normalize: ensure the smaller number comes first to handle rotation
            int key = (a <= b) ? (a * 10 + b) : (b * 10 + a);
            
            // If this domino has appeared 'counts[key]' times before,
            // it can form 'counts[key]' new pairs with the previous ones.
            pairs += counts[key];
            
            // Increment the frequency of this configuration
            counts[key]++;
        }
        
        return pairs;
    }
}