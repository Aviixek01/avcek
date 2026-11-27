class Solution {
    public boolean checkRecord(String s) {
        HashMap<Character , Integer>map = new HashMap<>();
            for(int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) +1);
            }
          if(map.getOrDefault('A', 0) >= 2) {
              return false;
           } 
      for(int i = 0; i < s.length() - 2; i++) {
          if(s.charAt(i) == 'L' &&
          s.charAt(i+1) == 'L' &&
          s.charAt(i+2) == 'L') {

          return false;
      }
    }
  return true;
    }
}