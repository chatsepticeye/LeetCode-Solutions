class Solution {
    public int firstUniqChar(String s) {
        // Step 1: Count frequencies of each character (a-z)
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the FIRST character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // Found the first unique character!
            }
        }

        return -1; // No unique character found
    }
}