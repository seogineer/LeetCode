class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        
        int maxLength = Integer.MIN_VALUE;
        for (int left = 0; left < s.length(); left++) {
            Map<Character, Integer> counts = new HashMap<>();
            for (int i = left; i < s.length(); i++) {
                if (counts.get(s.charAt(i)) != null && counts.get(s.charAt(i)) > 0) {
                    maxLength = Math.max(maxLength, counts.size());
                    break;
                }
                int count = counts.get(s.charAt(i)) == null ? 0 : counts.get(s.charAt(i));
                counts.put(s.charAt(i), count + 1);
            }
            maxLength = Math.max(maxLength, counts.size());
        }
        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}