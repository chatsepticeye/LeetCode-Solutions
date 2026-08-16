class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int n:nums){
            currentsum+=n;
            maxsum=Math.max(currentsum,maxsum);
        
        if (currentsum < 0) {
                currentsum = 0;
            }
        }
        return maxsum;
    }
}