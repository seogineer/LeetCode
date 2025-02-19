class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            int length = strs[i].length() < strs[i + 1].length() ? strs[i].length() : strs[i + 1].length();
            String temp = "";
            for (int j = 0; j < length; j++) {
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    break;
                }
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    temp += strs[i].charAt(j) + "";
                }
            }
            if (longestCommonPrefix.length() > temp.length()) {
                longestCommonPrefix = temp;
            }
        }
        return longestCommonPrefix;
    }
}