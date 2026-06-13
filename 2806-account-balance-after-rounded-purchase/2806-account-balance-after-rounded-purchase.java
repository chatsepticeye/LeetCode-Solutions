class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        // 1. Calculate the nearest multiple of 10 using the +5 trick
        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;
        
        // 2. Subtract the rounded value from your initial $100 balance
        return 100 - roundedAmount;
    }
}