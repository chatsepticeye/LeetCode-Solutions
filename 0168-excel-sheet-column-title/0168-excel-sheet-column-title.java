class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int r=columnNumber%26;
            char curr=(char)('A'+r);
            result.append(curr);
            columnNumber=columnNumber/26;
          
        }
        return result.reverse().toString();
    }
}