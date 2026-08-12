class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        
        // Array to store frequency of ASCII characters (0 to 127)
        int[] freq = new int[128];
        
        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            freq[rightChar]++; // 1. Add right character to window
            
            // 2. Shrink window while there's a duplicate character
            while (freq[rightChar] > 1) {
                char leftChar = s.charAt(left);
                freq[leftChar]--; // Remove left character from window
                left++;           // Move left boundary forward
            }
            
            // 3. Window s[left...right] is now valid (no duplicates)
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}