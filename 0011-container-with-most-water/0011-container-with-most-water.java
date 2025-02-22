class Solution {
    public int maxArea(int[] height) {
        int mostWater = 0;
        int start = 0;
        int last = height.length - 1;
        while (start < last) {
            int min = Math.min(height[start], height[last]);
            mostWater = Math.max(mostWater, (last - start) * min);
            if (height[start] < height[last]) {
                start++;
            } else {
                last--;
            }
        }
        return mostWater;
    }
}