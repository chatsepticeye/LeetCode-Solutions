class Solution {
    public char findTheDifference(String s, String t) {
        int [] f= new int[26];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            f[t.charAt(i)-'a']--;
            if(f[t.charAt(i)-'a']<0){
                return t.charAt(i);
            }
        }
        return 0; 
    }
}