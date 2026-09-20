class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int value = s.charAt(i) - 'a'+1;
            int revers = 27 - value;
            sum += (i+1)*revers;
        }
        return sum;
    }
}