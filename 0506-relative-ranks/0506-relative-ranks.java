class Pair {
    int score;
    int index;

    Pair(int score, int index) {
        this.score = score;
        this.index = index;
    }
}
class Solution {
    public String[] findRelativeRanks(int[] score) {
       int n = score.length;
       String ans[] = new String[n];
       PriorityQueue<Pair>pq = new PriorityQueue<>((a, b) -> b.score - a.score);
       for(int i = 0; i < n; i++) {
         pq.add(new Pair(score[i] , i));
       }
       
       int rank = 1;
       while(!pq.isEmpty()) {
       Pair p = pq.poll();
       if(rank == 1) {
        ans[p.index] = "Gold Medal";
       } else if(rank == 2) {
        ans[p.index] = "Silver Medal";
       } else if(rank == 3) {
        ans[p.index] = "Bronze Medal";
       } else {
        ans[p.index] = String.valueOf(rank);
       } 
       rank++;
       }
       return ans;
    }
}