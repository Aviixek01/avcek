class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n ; i++) {
            maxsum = Math.max(maxsum , nums[i]);
                if( nums[i] > 0 && !set.contains(nums[i]) ) {
                   set.add(nums[i]);
                   sum += nums[i];
                  
                }
        }
        if(sum == 0) {
            return maxsum;
        }
        return sum;
    }
}