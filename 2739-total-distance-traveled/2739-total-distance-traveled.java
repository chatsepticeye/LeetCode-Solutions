class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalLitersUsed = 0;
        
        // Loop as long as we can consume fuel in chunks of 5 liters
        while (mainTank >= 5) {
            // 1. Consume 5 liters from the main tank
            mainTank -= 5;
            totalLitersUsed += 5;
            
            // 2. If additional tank has fuel, inject 1 liter into the main tank
            if (additionalTank >= 1) {
                additionalTank--;
                mainTank += 1;
            }
        }
        
        // 3. Add whatever leftover fuel remains in the main tank (less than 5 liters)
        totalLitersUsed += mainTank;
        
        // 4. Multiply by mileage (10 km per liter) to get final distance
        return totalLitersUsed * 10;
    }
}