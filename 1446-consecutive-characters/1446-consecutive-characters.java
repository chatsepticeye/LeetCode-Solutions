class Solution {
    public int maxPower(String s) {
        int c=1;
        int m=1;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i) == s.charAt(i-1)){
            c++;
            m=Math.max(m,c);
           }
           else{
            c=1;
           }
        }
        return m;
    }
}
// class Solution {
//     public int maxPower(String s) {
//         if (s.length() == 0) return 0;

//         int maxLen = 1;
//         int currentLen = 1;

//         for (int i = 1; i < s.length(); i++) {
//             // Compare current character with the previous character
//             if (s.charAt(i) == s.charAt(i - 1)) {
//                 currentLen++;
//                 maxLen = Math.max(maxLen, currentLen);
//             } else {
//                 // Character changed, reset current streak back to 1
//                 currentLen = 1;
//             }
//         }

//         return maxLen;
//     }
// }