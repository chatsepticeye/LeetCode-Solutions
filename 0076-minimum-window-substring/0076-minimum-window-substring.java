class Solution {
    public String minWindow(String s, String t) {
        // int hash[]=new int[128];
        // for (int i=0;i<t.length();i++) hash[t.charAt(i)]++;
        // int low=0;
        // int c=t.length();
        // int minLen = Integer.MAX_VALUE;
        // int minStart = 0;
        // for(int high=0;high<s.length();high++){
        //     char h=s.charAt(high);
        //     if(hash[h]>0) c--;
        //     hash[h]--;
        //     while(c==0){
        //         if (high - low + 1 < minLen) {
        //             minLen = high - low + 1;
        //             minStart = low;
        //         }
        //         char cl=s.charAt(low);
        //         hash[cl]++;
        //         if(hash[cl]>0) c++;
        //         low++;

        //     }


        // }
        // if (minLen == Integer.MAX_VALUE) {
        //     return "";
        // } else {
        //     return s.substring(minStart, minStart + minLen);
        // }
        if(s.length()<t.length()) return "";
        int []targetfreq=new int[128];
        for(char c:t.toCharArray()){
            targetfreq[c]++;
        }
        int [] windowsfreq=new int[128];
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int startidx=0;
        int matched=0;
        for(int right=0;right<s.length();right++){
            char rchar=s.charAt(right);
            windowsfreq[rchar]++;
            if(targetfreq[rchar]>0 && windowsfreq[rchar]<=targetfreq[rchar]){
                matched++;
            }
            while(matched==t.length()){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    startidx=left;
                }
                char lchar=s.charAt(left);
                if(targetfreq[lchar]>0 && windowsfreq[lchar]==targetfreq[lchar]){
                    matched--;
                }
                windowsfreq[lchar]--;
                left++;

            }
        }
        return minlen==Integer.MAX_VALUE? "":s.substring(startidx,startidx+minlen);
    }
}