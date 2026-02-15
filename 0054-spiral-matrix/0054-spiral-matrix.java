class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
     int m=arr.length;
        int n=arr[0].length;
        ArrayList<Integer> ans = new ArrayList<>();;
        int minr=0;
        int maxr=m-1;
        int minc=0;
        int maxc=n-1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minr;j<=maxc;j++) ans.add(arr[minr][j]);
           if(minr>maxr || minc>maxc) break;
           minr++;
           for(int i=minr;i<=maxr;i++) ans.add(arr[i][maxc]);
           if(minr>maxr || minc>maxc) break;
           maxc--;
           for(int j=maxc;j>=minc;j--) ans.add(arr[maxr][j]);
           if(minr>maxr || minc>maxc) break;
           maxr--;
           for(int i=maxr;i>=minr;i--) ans.add(arr[i][minc]);
           if(minr>maxr || minc>maxc) break;
           minc++; 
    }
    return ans;   
    }
}