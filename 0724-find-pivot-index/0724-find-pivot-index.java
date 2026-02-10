class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int n:nums) total+=n;
        int ls=0;
        for(int i=0;i<nums.length;i++){
            int rs=total-ls-nums[i];
            if(ls==rs) return i;
            ls+=nums[i];
        }
        return -1;
    }
}