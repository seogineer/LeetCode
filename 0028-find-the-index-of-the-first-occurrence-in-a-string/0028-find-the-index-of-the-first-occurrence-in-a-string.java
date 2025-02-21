class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals(haystack)) {
            return 0;
        }
        int index = -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + needle.length(); j++) {
                sb.append(haystack.charAt(j));
            }
            if (needle.equals(sb.toString())) {
                index = i;
                break;
            }
        }
        return index;
    }
}