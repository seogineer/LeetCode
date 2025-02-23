class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> counts = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            while (counts.get(s.charAt(right)) != null && counts.get(s.charAt(right)) > 0) {
                counts.remove(s.charAt(left));
                left++;
            }
            int count = counts.get(s.charAt(right)) == null ? 0 : counts.get(s.charAt(right));
            counts.put(s.charAt(right), count + 1);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}