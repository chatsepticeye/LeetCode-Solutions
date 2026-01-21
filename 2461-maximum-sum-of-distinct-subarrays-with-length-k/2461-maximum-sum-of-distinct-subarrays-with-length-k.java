class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n=arr.length;
        long sum=0;
        long mx=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        int i=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            freq.put(arr[j],freq.getOrDefault(arr[j],0)+1);
            if(j-i+1>k){
                sum-=arr[i];
                freq.put(arr[i],freq.get(arr[i])-1);
                if(freq.get(arr[i])==0){
                    freq.remove(arr[i]);
                }
                i++;
            }
                if(j-i+1==k & freq.size()==k){
                    mx=Math.max(mx,sum);
                }
            }
           
        
        return mx;
    }
}