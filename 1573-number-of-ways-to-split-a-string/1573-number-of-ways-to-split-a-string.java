class Solution {
    public int numWays(String s) {
     int n=s.length();
     long totalones=0;
     for(char c:s.toCharArray()){
        if(c=='1') totalones++;
     }   
     if(totalones%3!=0) return 0;
     long mod=1_000_000_007;
     if(totalones==0){
        return (int) ((((long)(n - 1) * (n - 2)) / 2) % mod);
     }
     long tar=totalones/3;
     long waysforcut1=0;
     long waysforcut2=0;
     long runningones=0;
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='1') runningones++;
        if(runningones==tar) waysforcut1++;
        else if(runningones==2*tar){
            waysforcut2++;
        }
     }
     return (int)((waysforcut1*waysforcut2)%mod);
    }
}