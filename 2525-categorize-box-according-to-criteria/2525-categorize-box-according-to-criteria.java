class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        // Use long to prevent integer overflow during volume calculation
        long volume = (long) length * width * height;
        
        // Define the thresholds
        int dimensionThreshold = 10000; // 10^4
        long volumeThreshold = 1000000000; // 10^9
        int massThreshold = 100;
        
        // Determine if the box is Bulky
        boolean isBulky = (length >= dimensionThreshold || 
                           width >= dimensionThreshold || 
                           height >= dimensionThreshold || 
                           volume >= volumeThreshold);
        
        // Determine if the box is Heavy
        boolean isHeavy = (mass >= massThreshold);
        
        // Return category based on the conditions
        if (isBulky && isHeavy) {
            return "Both";
        } else if (!isBulky && !isHeavy) {
            return "Neither";
        } else if (isBulky) {
            return "Bulky";
        } else {
            return "Heavy";
        }
    }
}