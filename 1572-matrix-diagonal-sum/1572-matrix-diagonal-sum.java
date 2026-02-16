class Solution {
    public int diagonalSum(int[][] arr) {
      int m=arr.length;
      int n=arr[0].length;
      int sum=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if((i==j) || (i+j)==m-1) sum+=arr[i][j];

        }

      } 
      return sum; 
    }
}