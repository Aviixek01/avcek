class Solution {
    public String reverseWords(String s) {  
       StringBuilder st = new StringBuilder();
       s = s.trim();
       int n = s.length();
       int end = n;
       for(int i = n - 1; i >= 0 ; i--) {
           if(s.charAt(i) == ' ') {
            if(i+1 < end) {
              st.append(s.substring(i+1,end));
              st.append(' ');
            }
              end = i;
           }
       }
       st.append(s.substring(0 , end));
       return st.toString();
   }
}