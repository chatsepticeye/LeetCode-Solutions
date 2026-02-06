class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>res=new ArrayList<>();
        if(s.length()<p.length()) return res;//edge case
        int [] hash=new int [128];
        for(char ch:p.toCharArray()) hash[ch]++;
        int c=p.length();
        int low=0;
        for(int high=0;high<s.length();high++){
            char chigh=s.charAt(high);
            if(hash[chigh]>0) c--;
            hash[chigh]--;
            if(high>=p.length()){
                char clow=s.charAt(low);
                if((hash[clow]>=0)) c++;
                hash[clow]++;
                low++;
            }
            if(c==0) res.add(low);

        }
        return res;
    }
}