class Solution {
    public String minWindow(String s, String t) {
        int hash[]=new int[128];
        for (int i=0;i<t.length();i++) hash[t.charAt(i)]++;
        int low=0;
        int c=t.length();
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        for(int high=0;high<s.length();high++){
            char h=s.charAt(high);
            if(hash[h]>0) c--;
            hash[h]--;
            while(c==0){
                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    minStart = low;
                }
                char cl=s.charAt(low);
                hash[cl]++;
                if(hash[cl]>0) c++;
                low++;

            }


        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minStart, minStart + minLen);
        }
    }
}