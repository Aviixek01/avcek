class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int prefixsum[] = new int[n+1];
        prefixsum[0] = 0;
        for(int i = 1; i <= n; i++) {
            prefixsum[i] = prefixsum[i-1]+gain[i-1];
        }
        int max = 0;
        for(int i = 0; i < prefixsum.length; i++) {
            if(prefixsum[i] > max)
               max = prefixsum[i];
        }
        return max;
    }
}