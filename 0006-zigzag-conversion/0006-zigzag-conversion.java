class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new ArrayList<>());
        }

        int index = 0;
        int d = 1;
        for (char c : s.toCharArray()) {
            List<Character> row = rows.get(index);
            row.add(c);

            if (index == 0) {
                d = 1;
            } else if (index == numRows - 1) {
                d = -1;
            }
            index += d;
        }

        StringBuilder sb = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}