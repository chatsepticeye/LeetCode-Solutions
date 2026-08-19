class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int overallmax=arr[0];
        int onedelete=0;
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            onedelete=Math.max(nodelete,onedelete+x);
            nodelete=Math.max(x,nodelete+x);
            overallmax=Math.max(overallmax,Math.max(nodelete,onedelete));
        }
        return overallmax;

    }
}