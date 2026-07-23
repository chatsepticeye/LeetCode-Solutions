class Solution {
    public int countSegments(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // A segment begins if current char is NOT a space,
            // AND it's either the first char OR preceded by a space
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        
        return count;
    }
}