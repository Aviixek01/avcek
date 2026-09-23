class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalsum = 0;
        for(int i = 0; i < n ; i++) {
            totalsum += nums[i];
        }
        int target = totalsum - x;
         if(target < 0) {
            return -1;
        }

        if(target == 0) {
            return n;
        }
        int maxlen = 0;
        int l = 0;
        int sum = 0;
        for(int r = 0; r < n ; r++) {
            sum += nums[r];
            while(sum > target) {
                sum -= nums[l];
                l++;
            }
            if(sum == target) {
                int len = r - l + 1;
                maxlen = Math.max(maxlen , len);
            }
        }
   
//         for(int i = 0; i < n; i++){
//             int sum = 0;
//             for(int j = i; j < n ; j++) {
//                 sum += nums[j];
//                 if(sum == target) {
//                     int len = j-i+1;
//                     maxlen = Math.max(maxlen , len);
//                 }
//             }
//         }
//         if(maxlen == 0) {
//             return -1;
//         }
//         int minoperation = n-maxlen;
//         return minoperation;

//     }
// }
        if(maxlen == 0) {
            return -1;
        }
        
        int minoperation = n-maxlen;
        return minoperation;

    }
}