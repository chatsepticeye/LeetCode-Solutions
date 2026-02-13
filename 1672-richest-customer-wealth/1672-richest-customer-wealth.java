class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Loop through each customer (each row)
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            
            // Loop through their bank accounts (each col)
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            
            // Is this customer richer than the current leader?
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}