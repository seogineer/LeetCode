class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int x = 0; x < nums.length - 2; x++) {
            if (x > 0 && nums[x] == nums[x - 1]) {
                continue;
            }

            int y = x + 1;
            int z = nums.length - 1;

            while (y < z) {
                int total = nums[x] + nums[y] + nums[z];

                if (total > 0) {
                    z--;
                } else if (total < 0) {
                    y++;
                } else {
                    result.add(Arrays.asList(nums[x], nums[y], nums[z]));

                    while (y < z && nums[y] == nums[y + 1]) {
                        y++;
                    }
                    while (y < z && nums[z] == nums[z - 1]) {
                        z--;
                    }

                    y++;
                    z--;
                }
            }
        }
        return result;
    }
}