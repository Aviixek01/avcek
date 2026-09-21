import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] pairs) {
     int n = pairs.length;
     Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
     int count = 0;
     int current[] = pairs[0];
     for(int i = 1; i < n ; i++) {
         int next[] = pairs[i];
         if(current[1] > next[0]) {
            count++;
            if(current[1] > next[1]) {
                current = next;
            }
         } else {
            current = next;
         }
     }
     return count;
    }
}