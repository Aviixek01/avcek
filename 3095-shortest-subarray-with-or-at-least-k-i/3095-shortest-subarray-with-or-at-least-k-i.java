class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minlen = Integer.MAX_VALUE;
        for(int i = 0; i < n ;i++) {
            int or = 0;
            for(int j = i ; j < n; j++) {
                if(nums[j] >= k) 
                    return 1;
                or = or | nums[j];
                if(or >= k)
                minlen = Math.min(minlen , j - i + 1);
                
            }
        }
      if(minlen == Integer.MAX_VALUE) {
        return -1;
      }
      return minlen;
    }
}