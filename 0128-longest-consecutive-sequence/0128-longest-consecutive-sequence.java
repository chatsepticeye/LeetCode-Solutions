class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele: nums) set.add(ele);
        int longest=0;
        for(int i: set){
            if(!set.contains(i-1)){
                int j=i;
                int currentstreak=1;
                while(set.contains(j+1)){
                    j++;
                    currentstreak++;
                }
                longest=Math.max(longest,currentstreak);
            }

        }
        return longest;
        
    }
}