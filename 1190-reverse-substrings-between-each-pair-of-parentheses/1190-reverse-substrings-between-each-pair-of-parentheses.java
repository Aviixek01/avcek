class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Character>st = new Stack<>();
        Stack<Character>temp = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == ')') {
               while(st.peek() != '(') {
                 temp.push(st.pop());  
               }
               st.pop();
            //    while(!temp.isEmpty()) {
            //     st.push(temp.pop());
            //    }
              for (int j = 0; j < temp.size(); j++) {
                 st.push(temp.get(j));
               }
              temp.clear();
            } else {
            st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}