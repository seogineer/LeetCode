class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = sMap.get(c) == null ? 1 : sMap.get(c) + 1;
            sMap.put(c, count);
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = tMap.get(c) == null ? 1 : tMap.get(c) + 1;
            tMap.put(c, count);
        }

        for (char c : sMap.keySet()) {
            if (sMap.get(c) == null || tMap.get(c) == null) {
                return false;
            }
            int sCount = sMap.get(c);
            int tCount = tMap.get(c);
            if (sCount != tCount) {
                return false;
            }
        }

        for (char c : tMap.keySet()) {
            if (sMap.get(c) == null || tMap.get(c) == null) {
                return false;
            }
            int sCount = sMap.get(c);
            int tCount = tMap.get(c);
            if (sCount != tCount) {
                return false;
            }
        }

        return true;
    }
}