class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int ans = 0;
       
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            if(s.charAt(i) == '(') {
                
                count++;
            } else if (s.charAt(i) ==')') {
                   if(count > 0) {
                      count--;
                   } else {
                   ans++;  
                  }             
            }
        }
        return count + ans;
    }
}