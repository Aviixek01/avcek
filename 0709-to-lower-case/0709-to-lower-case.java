class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
       for(int i = 0; i < s.length(); i++) {
          char ch = s.charAt(i);
          char result = Character.toLowerCase(ch);
          sb.append(result);
       }
       return sb.toString();
    }
}