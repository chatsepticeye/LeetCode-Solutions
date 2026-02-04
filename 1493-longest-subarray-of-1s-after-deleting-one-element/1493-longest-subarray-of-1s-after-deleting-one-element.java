class Solution {
    public int longestSubarray(int[] nums) {
       int ans=0;
       int low=0;
       int zeros=0;
       for(int high=0;high<nums.length;high++){
        if(nums[high]==0) zeros++;
        while(zeros>1){
            if(nums[low]==0) zeros--;
            low++;
        }
        ans=Math.max(ans,high-low);
       }
       return ans;
    }
}