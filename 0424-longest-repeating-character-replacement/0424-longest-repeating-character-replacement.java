class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int freq[]=new int[26];
        int maxlen=0;
        int maxfreq=0;
        for(int right=0;right<s.length();right++){
            char currchar=s.charAt(right);
            freq[currchar-'A']++;
            maxfreq=Math.max(maxfreq,freq[currchar-'A']);
            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}