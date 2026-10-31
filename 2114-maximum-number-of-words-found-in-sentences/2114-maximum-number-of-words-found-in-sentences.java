class Solution {
    public int mostWordsFound(String[] sentences) {
       int n = sentences.length;
       int max = 0;
       for(int i = 0; i < n; i++) {
        int count = 0;
         for(int j = 0; j < sentences[i].length(); j++) {
             
              if(sentences[i].charAt(j) == ' ') {
                 count++;
              }
         }
         count++;
         
         if(count > max) {
            max = count;
         }
           
       }
       return max;
    }
}