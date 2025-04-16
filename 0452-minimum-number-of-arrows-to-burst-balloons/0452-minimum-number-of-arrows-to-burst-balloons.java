class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 1;
        int arrowPos = points[0][1];
        for (int i = 1; i < points.length; i++) {
            int[] arr = points[i];
            if (arr[0] > arrowPos) {
                arrowPos = points[i][1];
                count++;
            }
        }

        return count;
    }
}