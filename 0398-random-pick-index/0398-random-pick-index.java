import java.util.*;

class Solution {
    // Map to store: Number -> List of all its indices
    private Map<Integer, List<Integer>> indicesMap;
    private Random rand;

    public Solution(int[] nums) {
        indicesMap = new HashMap<>();
        rand = new Random();
        
        // Fill the map
        for (int i = 0; i < nums.length; i++) {
            if (!indicesMap.containsKey(nums[i])) {
                indicesMap.put(nums[i], new ArrayList<>());
            }
            indicesMap.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> indices = indicesMap.get(target);
        // Pick a random index from the list of available indices
        int randomIndex = rand.nextInt(indices.size());
        return indices.get(randomIndex);
    }
}