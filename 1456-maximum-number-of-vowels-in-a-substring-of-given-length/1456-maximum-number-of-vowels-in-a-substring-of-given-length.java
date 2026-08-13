class Solution {
    public int maxVowels(String s, int k) {
    int vowelcount=0;
    int n=s.length();
       for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            vowelcount++;
        }
       }
       int maxvowel=vowelcount;
       for(int right=k;right<n;right++){
        if(isVowel(s.charAt(right))){
            vowelcount++;
        }
        if(isVowel(s.charAt(right-k))){
            vowelcount--;
        }
        maxvowel=Math.max(maxvowel,vowelcount);
    }
    return maxvowel;
    }
       private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
       } 
    
}