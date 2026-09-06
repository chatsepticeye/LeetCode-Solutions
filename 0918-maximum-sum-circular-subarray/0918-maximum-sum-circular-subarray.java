class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int totalsum=0;
       int currmin=0;
       int currmax=0;
       int minsum=Integer.MAX_VALUE;
       int maxsum=Integer.MIN_VALUE;
       for(int n:nums){
        totalsum+=n;
        currmax+=n;
        maxsum=Math.max(maxsum,currmax);
        if(currmax<0) currmax=0;
        currmin+=n;
        minsum=Math.min(minsum,currmin);
        if(currmin>0) currmin=0;

       }
       if(maxsum<0) return maxsum;
       return Math.max(totalsum-minsum,maxsum);
}
}