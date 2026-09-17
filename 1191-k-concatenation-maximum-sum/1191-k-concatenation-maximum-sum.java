class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
       long mod=1_000_000_007L;
       long totalsum=0;
       for(int x:arr){
        totalsum+=x;
       }
       int repetition=(k==1)? 1:2;
       long kadanesum=kadane(arr,repetition);
       if(k==1){
        return (int)(kadanesum%mod);
       }
       if(totalsum<=0){
        return (int)(kadanesum%mod);
       }
       // if totalsum>0,include(k-2) full middle
       long result=kadanesum + (long)(k-2)*totalsum;
       return (int)(result%mod);
    }
       private long kadane(int [] arr,int rep){
        long currentsum=0;
        long maxsum=0;
        for(int r=0;r<rep;r++){
            for(int val:arr){
                currentsum+=val;
                if(currentsum<0){
                    currentsum=0;
                }
                maxsum=Math.max(maxsum,currentsum);
            }
        
       }
        return maxsum;
       
    }
}