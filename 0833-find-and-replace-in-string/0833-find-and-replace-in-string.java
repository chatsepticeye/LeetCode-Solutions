import java.util.HashMap;
import java.util.Map;

class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        // Map to store valid replacement operations indexed by their starting position
        Map<Integer, Integer> replacementMap = new HashMap<>();
        
        for (int i = 0; i < indices.length; i++) {
            int startIdx = indices[i];
            String source = sources[i];
            
            // Check if the source substring exists at the specified index in original string s
            if (s.startsWith(source, startIdx)) {
                replacementMap.put(startIdx, i);
            }
        }
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (replacementMap.containsKey(i)) {
                // If a valid replacement starts here, append the target string
                int opIdx = replacementMap.get(i);
                result.append(targets[opIdx]);
                // Skip the length of the source substring in the original string
                i += sources[opIdx].length();
            } else {
                // If no replacement starts here, keep the original character
                result.append(s.charAt(i));
                i++;
            }
        }
        
        return result.toString();
    }
}