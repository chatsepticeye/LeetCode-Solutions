class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        // int hash[]=new int[128];
        // List<Integer> ans=new ArrayList<>();
        // for(int i=0;i<p.length();i++) hash[p.charAt(i)]++;
        // int low=0;
        // int c=p.length();
        // for(int high=0;high<s.length();high++){
        //     char h=s.charAt(high);
        //     if(hash[h]>0) c--;
        //     hash[h]--;
        //     if(c==0) ans.add(low);
        //     if(high-low+1==p.length()){
        //         char cl=s.charAt(low);
        //         hash[cl]++;
        //         if (hash[cl] > 0) c++;
        //         low++;
        //     }
        // }
        // return ans;
        int f1[]=new int[26];
        int f2[]=new int[26];
        List<Integer> res=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        if(k>n){ return res; }
        for(int i=0;i<k;i++){
            f1[s.charAt(i)-'a']++;
            f2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2)){
            res.add(0);
        }
        for(int right=k;right<n;right++){
            f1[s.charAt(right)-'a']++;
            f1[s.charAt(right-k)-'a']--;
        
        if(Arrays.equals(f1,f2)){
            res.add(right-k+1);
        }
        }
        return res;
        

    }
}