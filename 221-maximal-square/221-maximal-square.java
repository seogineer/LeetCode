class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0){ return 0; }
        
        int max = 0;
        int[][] square = new int[matrix.length+1][matrix[0].length+1];
        
        for(int i = 1; i <= matrix.length; i++){
            for(int j = 1; j <= matrix[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    square[i][j] = Math.min(square[i-1][j-1], Math.min(square[i-1][j], square[i][j-1])) + 1;
                    max = Math.max(max, square[i][j]);
                }
            }
        }
        
        return max * max;
    }
}