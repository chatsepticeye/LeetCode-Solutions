class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int co = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                v++;
            } else if (Character.isLetter(c)) { // Only increment consonant count if it's an actual letter!
                co++;
            }
        }
        
        if (co == 0) {
            return 0;
        }
        
        return v / co;
    }
}