class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int temp = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            temp += nums[right];
            while (temp >= target) {
                minLength = Math.min(minLength, right - left + 1);
                temp -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}