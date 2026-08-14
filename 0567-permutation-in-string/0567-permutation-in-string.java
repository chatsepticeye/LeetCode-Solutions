class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int n1=s1.length();
      int n2=s2.length();
      int freq1[]=new int[26];
      int freq2[]=new int[26];
      if (n1 > n2) return false;
      for(int i=0;i<n1;i++){
        freq1[s1.charAt(i)-'a']++;
        freq2[s2.charAt(i)-'a']++;
      }
      if(Arrays.equals(freq1,freq2)) return true;
      for(int right=n1;right<n2;right++){
        freq2[s2.charAt(right)-'a']++;
        freq2[s2.charAt(right-n1) -'a']--;
        if(Arrays.equals(freq1,freq2)) return true;
      }
      return false;
    }


}