class Solution {
    public boolean wordPattern(String pattern, String s) {
         String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        // Compare pattern characters and words manually using loops
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = i + 1; j < pattern.length(); j++) {
                
                // If same letters → words must also be same
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (!words[i].equals(words[j])) {
                        return false;
                    }
                }

                // If different letters → words must be different
                if (pattern.charAt(i) != pattern.charAt(j)) {
                    if (words[i].equals(words[j])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}