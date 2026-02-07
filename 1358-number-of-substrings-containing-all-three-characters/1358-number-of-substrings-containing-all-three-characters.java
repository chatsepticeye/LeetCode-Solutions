class Solution {
    public int numberOfSubstrings(String s) {
       int c=3;
       int [] hash=new int[3];
       int low=0;
       int sub=0;
       for(int high=0;high<s.length();high++){
        char chigh=s.charAt(high);
        if(hash[chigh-'a']==0) c--;
        hash[chigh-'a']++;
        while(c==0){
            sub+=s.length()-high;
            char clow=s.charAt(low);
            hash[clow-'a']--;
            if(hash[clow-'a']==0) c++;
            low++;
        }

       } 
       return sub;
    }
}