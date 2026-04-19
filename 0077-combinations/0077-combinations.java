class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        backtrack(1, list, combination, n, k);
        return list;
    }

    private void backtrack(
        int start,
        List<List<Integer>> list,
        List<Integer> combination,
        int n,
        int k
    ) {
        if (combination.size() == k) {
            list.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            backtrack(i + 1, list, combination, n, k);
            combination.remove(combination.size() - 1);
        }
    }
}