class Solution {
    public String triangleType(int[] nums) {
        // 1. Check Triangle Validity: Sum of any two sides must be > third side
        if (nums[0] + nums[1] <= nums[2] || 
            nums[1] + nums[2] <= nums[0] || 
            nums[0] + nums[2] <= nums[1]) {
            return "none";
        }
        
        // 2. Check for Equilateral (All 3 sides equal)
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        
        // 3. Check for Isosceles (Any 2 sides equal)
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            return "isosceles";
        }
        
        // 4. If valid and not equilateral or isosceles, it must be scalene
        return "scalene";
    }
}