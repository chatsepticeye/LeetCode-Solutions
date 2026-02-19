class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        
        // Step 1: Count how many elements of nums1 exist in nums2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count1++;
                    break; // Found a match! Stop searching and move to next nums1 element
                }
            }
        }
        
        // Step 2: Count how many elements of nums2 exist in nums1
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    count2++;
                    break; // Found a match! Stop searching and move to next nums2 element
                }
            }
        }
        
        // Step 3: Return the exact format LeetCode wants
        return new int[]{count1, count2};
    }
}