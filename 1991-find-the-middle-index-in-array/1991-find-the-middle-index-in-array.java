class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftsum[] = new int[n];
        int rightsum[] = new int[n];
        leftsum[0] = nums[0];
        rightsum[n-1] = 0;
        
        for(int i = 1; i < n; i++) {
            leftsum[i] = leftsum[i-1] + nums[i];
        }
        for(int i = n-2; i >= 0; i--) {
            rightsum[i] = rightsum[i+1]+nums[i+1];
        }
        for(int i = 0; i < n ; i++) {
            int pivot1 = leftsum[i]-nums[i];
            int pivot2 = rightsum[i];
            if(pivot1 == pivot2) {
                return i;
            }
        }
      return -1;
    }
}