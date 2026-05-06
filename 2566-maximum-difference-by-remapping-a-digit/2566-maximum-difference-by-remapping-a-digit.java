class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        
        // 1. Find Max Value
        char targetMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                targetMax = c;
                break;
            }
        }
        // If all are 9s, the number stays the same. 
        // Otherwise, replace the target digit with 9.
        String maxStr = (targetMax == ' ') ? s : s.replace(targetMax, '9');
        int maxVal = Integer.parseInt(maxStr);
        
        // 2. Find Min Value
        // Always replace the first digit with 0 to get the smallest value.
        char targetMin = s.charAt(0);
        String minStr = s.replace(targetMin, '0');
        int minVal = Integer.parseInt(minStr);
        
        return maxVal - minVal;
    }
}