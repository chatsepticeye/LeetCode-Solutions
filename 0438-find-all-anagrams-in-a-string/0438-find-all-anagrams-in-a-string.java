class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int hash[]=new int[128];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<p.length();i++) hash[p.charAt(i)]++;
        int low=0;
        int c=p.length();
        for(int high=0;high<s.length();high++){
            char h=s.charAt(high);
            if(hash[h]>0) c--;
            hash[h]--;
            if(c==0) ans.add(low);
            if(high-low+1==p.length()){
                char cl=s.charAt(low);
                hash[cl]++;
                if (hash[cl] > 0) c++;
                low++;
            }
        }
        return ans;

    }
}