class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int hash[]=new int[128];
        for(char ch:s1.toCharArray()) hash[ch]++;
        int count=s1.length();
        int low=0;
        for(int high=0;high<s2.length();high++){
            char chigh=s2.charAt(high);
            if(hash[chigh]>0) count --;
            hash[chigh]--;
            if(count==0) return true;
            if(high>=s1.length()-1){
                char clow=s2.charAt(low);
                if(hash[clow]>=0) count++;
                hash[clow]++;
                low++;

            }
        }
        return false;
    }
}