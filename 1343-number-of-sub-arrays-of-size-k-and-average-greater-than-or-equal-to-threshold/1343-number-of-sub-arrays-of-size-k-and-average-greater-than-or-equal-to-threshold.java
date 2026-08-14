class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int maxsum=0;
        int sum=0;
        int targetsum=threshold*k;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=targetsum){
            count++;
        }
        for(int right=k;right<arr.length;right++){
            sum=sum+arr[right]-arr[right-k];
           if(sum>=targetsum){
            count++;
           }
        }
        return count;
    }
}