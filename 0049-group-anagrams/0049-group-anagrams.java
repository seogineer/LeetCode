class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            groups.computeIfAbsent(sortedStr, k -> new ArrayList()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}