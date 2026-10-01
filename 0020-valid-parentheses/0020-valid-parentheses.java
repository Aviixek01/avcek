class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(s.charAt(i) == '(' ||s.charAt(i) == '[' || s.charAt(i) == '{') {
                 st.push(s.charAt(i));
            } else {
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') ||
                   (ch == ']' && top != '[') ||
                   (ch == '}' && top != '{')) {
                    return false;
               }
            }
        }
        return st.isEmpty();
    }
}