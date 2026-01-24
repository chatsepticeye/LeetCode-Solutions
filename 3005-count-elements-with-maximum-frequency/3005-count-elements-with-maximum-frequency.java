class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int mx=0;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int i:freq.values()){
            mx=Math.max(mx,i);
        }
        int total=0;
        for(int i:freq.values()){
            if(i==mx){
                total+=i;
            }
        }
        return total;

    }
}