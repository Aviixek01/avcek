class Solution {
    public int majorityElement(int[] nums) {
      HashMap < Integer , Integer> map = new HashMap<>();
      int n = nums.length;
      for(int i = 0 ; i < nums.length; i++) {
         map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
      }
    //   Set<Integer>keySet = map.keySet();
    //   for(Integer key : keySet) {
    //      if(map.get(key) > n/2 ) {
    //          return key;
    //      }
    //    }
    //    return -1;

    Set<Integer>keySet = map.keySet();
    for(Integer key : keySet) {
        if(map.get(key) > n/2) {
            return key;
        }
     }
     return -1;
    }
}