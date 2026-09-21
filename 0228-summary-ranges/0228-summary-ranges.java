class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        ArrayList<String>list = new ArrayList<>();
        int l = 0;
        for(int r = 0; r < n; r++) {
            if(r == n -1 || nums[r]+1 != nums[r+1]) {
                if(l == r) {
                     list.add(String.valueOf(nums[l]));
                } else {
                String result = nums[l] + "->" + nums[r];
                list.add(result);
                }
                l = r+1;
            }
        }
           
        return list;
    }
}