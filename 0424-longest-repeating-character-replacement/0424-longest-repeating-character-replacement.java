class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int maxfreq=0;
        int maxlen=0;
        int[] hash=new int[26];
        for(int high=0;high<s.length();high++){
            char currchar=s.charAt(high);
            hash[currchar-'A']++;
            maxfreq=Math.max(maxfreq,hash[currchar-'A']);
            while((high-low+1)-maxfreq>k){
                char left=s.charAt(low);
                hash[left-'A']--;
                low++;
            }
            maxlen=Math.max(maxlen,high-low+1);

        }
        return maxlen;
    }
}