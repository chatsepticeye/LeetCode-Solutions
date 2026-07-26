import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> mapS2T = new HashMap<>();
        HashMap<Character, Character> mapT2S = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If c1 was mapped before, check if it maps to the same c2
            if (mapS2T.containsKey(c1) && mapS2T.get(c1) != c2) {
                return false;
            }

            // If c2 was mapped before, check if it maps to the same c1
            if (mapT2S.containsKey(c2) && mapT2S.get(c2) != c1) {
                return false;
            }

            // Record the new mapping for both directions
            mapS2T.put(c1, c2);
            mapT2S.put(c2, c1);
        }

        return true;
    }
}