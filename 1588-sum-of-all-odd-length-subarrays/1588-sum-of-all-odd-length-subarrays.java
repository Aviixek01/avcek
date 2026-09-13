class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2 ; i >= 0; i--) {
           suffix[i] = suffix[i+1] + arr[i];
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j+=2) {
                if(j == n - 1) {
                    ans += suffix[i];
                } else {
                    ans += suffix[i] - suffix[j+1];
                }
            }
        }
        return ans;
    }
}