class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++) {
                    boolean matchesLeft = (i > 0 && arr[i - 1] == ch);
                    boolean matchesRight = (i < arr.length - 1 && arr[i + 1] == ch);
                    
                    if (!matchesLeft && !matchesRight) {
                        arr[i] = ch;
                        break;
                    }
                }
            }
        }
        
        return new String(arr);
    }
}