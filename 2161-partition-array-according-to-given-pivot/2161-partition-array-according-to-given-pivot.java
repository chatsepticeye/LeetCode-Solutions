import java.util.ArrayList;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // 1. Create dynamic lists to hold the groups
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> middle = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        // 2. Loop through the array (Fix: use < instead of <=)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                left.add(nums[i]); // Java uses .add() instead of .append()
            } else if (nums[i] == pivot) {
                middle.add(nums[i]);
            } else {
                right.add(nums[i]);
            }
        } 
        
        // 3. Merge everything back into a primitive int[] array
        int[] result = new int[nums.length];
        int index = 0;
        
        for (int num : left) result[index++] = num;
        for (int num : middle) result[index++] = num;
        for (int num : right) result[index++] = num;
        
        return result;  
    }
}