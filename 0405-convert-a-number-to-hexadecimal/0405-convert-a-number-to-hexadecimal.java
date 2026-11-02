class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        String hex = "0123456789abcdef";

        while (num != 0) {
            int rem = num & 15;
            sb.append(hex.charAt(rem));
            num = num >>> 4;
        }

        return sb.reverse().toString();
    }
}