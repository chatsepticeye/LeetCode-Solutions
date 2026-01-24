class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        while(i<j){
           int sum=numbers[i]+numbers[j];
           if(sum==target){
            return new int[]{i+1,j+1};
           }
           else if(sum<target){
            i++;
           }
           else if(sum>target){
            j--;
           }

        }
        return new int[]{-1,-1};
    }
}