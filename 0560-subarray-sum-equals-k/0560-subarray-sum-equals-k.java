class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Base case: a sum of 0 has been seen once (at the start)
        map.put(0, 1);
        
        for (int num : nums) {
            currentSum += num;
            
            // If (currentSum - k) exists, it means a subarray sum equals k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            // Record this currentSum in the map
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}