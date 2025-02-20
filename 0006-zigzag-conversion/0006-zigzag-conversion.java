class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        String[][] arr = new String[numRows][s.length()];
        boolean flag = true;
        int row = 0;
        int col = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[row][col] = s.charAt(i) + "";
            if (flag) {
                row++;
            } else {
                row--;
                col++;
            }
            if (row == numRows - 1) {
                row %= numRows;
                flag = !flag;
            } else if (row == 0) {
                flag = !flag;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (arr[i][j] == null) {
                    continue;
                }
                sb.append(arr[i][j]);
            }
        }

        return sb.toString();
    }
}