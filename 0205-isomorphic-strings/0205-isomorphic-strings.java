class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (sMap.get(s.charAt(i)) == null) {
                sMap.put(s.charAt(i), t.charAt(i));
            } else {
                if (sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if (tMap.get(t.charAt(i)) == null) {
                tMap.put(t.charAt(i), s.charAt(i));
            } else {
                if (tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}