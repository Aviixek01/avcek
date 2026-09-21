class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);
        ArrayList<int[]>result = new ArrayList<>();
        int current[] = newInterval;
        for(int i = 0; i < n; i++) {
             int next[] = intervals[i];
             if(next[1] < current[0]) {
                 result.add(next);
             } else if(next[0] > current[1]) {
                result.add(current);
                current = next;
             } else {
            current[0] = Math.min(current[0] , next[0]);
            current[1] = Math.max(current[1] , next[1]);
           }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }
}