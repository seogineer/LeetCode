class Solution {
    public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int majorityIndex = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], (counts.get(nums[i]) == null ? 0 : counts.get(nums[i])) + 1);
        }
        for (Integer key : counts.keySet()) {
            if (max < counts.get(key)) {
                max = Math.max(max, counts.get(key));
                majorityIndex = key;
            }
        }
        return majorityIndex;
    }
}