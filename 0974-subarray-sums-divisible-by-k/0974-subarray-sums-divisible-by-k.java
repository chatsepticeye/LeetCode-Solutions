class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int currsum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            currsum+=num;
            int r=currsum%k;
            if(r<0) r+=k;
            if(map.containsKey(r)) count+=map.get(r);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}