class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n=nums.length;
       int maxsum=0;
       int sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       }
       maxsum=sum;
       for(int right=k;right<n;right++){
        sum=sum+nums[right]-nums[right-k];
        maxsum=Math.max(maxsum,sum);

       }
       return (double) maxsum/k;
    }
}