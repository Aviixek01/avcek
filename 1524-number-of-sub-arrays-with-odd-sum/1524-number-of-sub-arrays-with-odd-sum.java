class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int odd = 0;
        int even = 1;
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < n; i++) {
            
                sum += arr[i];
                if(sum % 2 != 0) {
                   count += even;
                   odd++;
                } else {
                    count += odd;
                    even++;
                }
            count %= mod;
        }
        return count;
    }
}