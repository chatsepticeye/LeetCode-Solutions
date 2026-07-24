class Solution {
    public int countCharacters(String[] words, String chars) {
        // Step 1: Count character frequencies in `chars`
        int[] charCounts = new int[26];
        for (char c : chars.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int totalLength = 0;

        // Step 2: Process each word
        for (String word : words) {
            int[] wordCounts = new int[26];
            boolean isGood = true;

            // Count character frequencies for the current word
            for (char c : word.toCharArray()) {
                wordCounts[c - 'a']++;
                
                // If word requires more of char `c` than `chars` provides, it's not good
                if (wordCounts[c - 'a'] > charCounts[c - 'a']) {
                    isGood = false;
                    break; // No need to check remaining characters of this word
                }
            }

            // Step 3: If valid, add its length
            if (isGood) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}