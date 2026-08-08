class Solution {
    public boolean scoreBalance(String s) {
        int totalScore = 0;
        for (char c : s.toCharArray()) {
            totalScore += (c - 'a' + 1);
        }
        
        if (totalScore % 2 != 0) {
            return false;
        }
        
        int target = totalScore / 2;
        int leftScore = 0;
        
        // Loop up to s.length() - 1 to ensure right substring is non-empty
        for (int i = 0; i < s.length() - 1; i++) {
            leftScore += (s.charAt(i) - 'a' + 1);
            if (leftScore == target) {
                return true;
            }
        }
        
        return false;
    }
}