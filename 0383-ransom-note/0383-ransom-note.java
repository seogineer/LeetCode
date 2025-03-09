class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (map.get(magazine.charAt(i)) == null) {
                map.put(magazine.charAt(i), 1);
                continue;
            }
            map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!map.containsKey(ransomNote.charAt(i)) || map.get(ransomNote.charAt(i)) == 0) {
                return false;
            }
            map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
        }
        return true;
    }
}