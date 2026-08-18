import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Step 1: Add banned words to a HashSet for O(1) lookup
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        // Step 2: Convert to lowercase and replace non-alphanumeric chars with space
        String cleanedParagraph = paragraph.toLowerCase().replaceAll("[^a-z0-9]", " ");
        String[] words = cleanedParagraph.split("\\s+");

        // Step 3: Count frequencies of non-banned words
        Map<String, Integer> countMap = new HashMap<>();
        String mostFrequentWord = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }

            int count = countMap.getOrDefault(word, 0) + 1;
            countMap.put(word, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        return mostFrequentWord;
    }
}