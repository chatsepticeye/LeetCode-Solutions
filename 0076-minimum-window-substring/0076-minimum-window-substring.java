class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        int[] targetMap = new int[128];
        for (char c : t.toCharArray()) targetMap[c]++;
        if(s.length()<t.length()) return "";
        int minlow=0;
        int low=0;
        int minlen=Integer.MAX_VALUE;
        int count=t.length();
        for(int high=0;high<s.length();high++){
            char chigh=s.charAt(high);
            if(targetMap[chigh]>0) count--;
            targetMap[chigh]--;
            while(count==0){
                if(high-low+1<minlen){
                    minlen=high-low+1;
                    minlow=low;
                }
                char clow=s.charAt(low);
                targetMap[clow]++;
                if(targetMap[clow]>0) count++;
                low++;
            }
            
            
    }
      return minlen==Integer.MAX_VALUE? "":s.substring(minlow,minlow+minlen);
}
}