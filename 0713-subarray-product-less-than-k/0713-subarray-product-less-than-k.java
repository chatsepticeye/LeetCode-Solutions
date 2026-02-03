class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int low=0;
        int prod=1;
        int ans=0;
        for(int high=0;high<nums.length;high++){
            prod=prod*nums[high];
             while(prod>=k){
                prod /=nums[low];
                low++;
                }
                 ans+=high-low+1;
        }
        return ans;
    }
}