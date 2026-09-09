class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
       
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean.append(ch);
            }
        }
        String str = clean.toString();
        // int n = str.length();
        // for(int i = 0; i < n/2 ; i++) {
        //     if(str.charAt(i) != str.charAt(n-i-1)) {
        //         return false;
        //     }
        // }
        // return true;
        int n = str.length();
        int left = 0;
        int right = n - 1;
        while(left < right) {
           if(str.charAt(left) != str.charAt(right)) {
            return false;
           }
           left++;
           right--;
        }
        return true;
    }
}