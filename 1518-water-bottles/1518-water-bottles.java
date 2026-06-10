class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = 0;
        int emptyBottles = 0;
        
        while (numBottles > 0) {
            // 1. Drink all available full bottles
            totalDrank += numBottles;
            emptyBottles += numBottles;
            
            // 2. Calculate how many new full bottles we get from the market
            numBottles = emptyBottles / numExchange;
            
            // 3. Keep track of the leftover empty bottles that couldn't be exchanged
            emptyBottles = emptyBottles % numExchange;
        }
        
        return totalDrank;
    }
}