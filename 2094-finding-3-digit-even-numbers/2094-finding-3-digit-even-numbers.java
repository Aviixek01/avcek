class Solution {
    public int[] findEvenNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                     if(i == j || j == k || k == i) {
                        continue;
                     }
                     if(nums[i] == 0) {
                        continue;
                     }
                     if(nums[k] % 2 != 0) {
                        continue;
                     }
                     int ans = nums[i]*100
                             + nums[j]*10
                             + nums[k];
                    set.add(ans);
                }
            }
        }
        int result[] = new int[set.size()];
        int i = 0;
        for(int num : set) {
            result[i] = num;
            i++;
        }
        Arrays.sort(result);
        return result;
    }
}