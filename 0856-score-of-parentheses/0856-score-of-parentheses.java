class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer>st = new Stack<>();
        st.push(0);
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                st.push(0);
            } else {
                int inside = st.pop();
                int score;
                 if(inside == 0) {
                    score = 1;
                 } else {
                    score = 2*inside;
                 }
                 int previous = st.pop();
                 st.push(previous + score);
            }
        }
           return st.peek();
    }
}