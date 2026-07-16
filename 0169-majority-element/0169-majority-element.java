class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int majoritythreshold=nums.length/2;
        for(int n:nums){
            int c=mpp.getOrDefault(n,0);
            mpp.put(n,c+1);
            if (c+1 > majoritythreshold) {
                return n;
            }
        }
        return -1;

            
        }
    
}