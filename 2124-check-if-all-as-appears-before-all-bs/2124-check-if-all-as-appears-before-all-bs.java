class Solution {
    public boolean checkString(String s) {
        HashSet<Character>set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
           
           char ch = s.charAt(i);

           if(ch == 'b') {
             set.add('b');
           }
            if(ch == 'a' && set.contains('b')) {
                return false;
            }
            
        }
        return true;
    }
}