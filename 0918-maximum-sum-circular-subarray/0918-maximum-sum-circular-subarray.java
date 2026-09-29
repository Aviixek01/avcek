class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currsum = nums[0];
        int maxsum = nums[0];
        int totalsum = nums[0];
        for(int i = 1; i < n; i++) {
            totalsum += nums[i];
            currsum = Math.max(nums[i] , currsum+nums[i]);
            maxsum = Math.max(maxsum , currsum);
        }
        int currmin = nums[0];
        int minsum = nums[0];
        for(int i = 1; i < n; i++) {
            currmin = Math.min(nums[i] , currmin + nums[i]);
            minsum = Math.min(currmin , minsum);
        }
        if(maxsum < 0) {
            return maxsum;
        }
        int circularsum = totalsum - minsum;
        int ans = Math.max(circularsum , maxsum);
        return ans;
    }
}