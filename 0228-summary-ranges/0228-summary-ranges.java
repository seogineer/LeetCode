class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        HashSet<Long> set = new HashSet<>();
        for (int num : nums) {
            set.add((long) num);
        }

        List<String> list = new ArrayList<>();

        boolean flag = false;
        long startNum = (long) nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (flag) { 
                startNum = nums[i];
                flag = false;
            }

            long currentNum = (long) nums[i];

            if (set.contains(currentNum + 1)) {
                continue;
            }

            if (startNum == currentNum) {
                list.add(startNum + "");
            } else {
                list.add(startNum + "->" + currentNum);
            }

            flag = true;
        }

        return list;
    }
}