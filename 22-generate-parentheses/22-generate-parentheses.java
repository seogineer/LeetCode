class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        backtracking(list, "", 0, 0, n);
        return list;
    }
    
    private void backtracking(
        ArrayList<String> list,
        String parentheses,
        int left,
        int right,
        int max
    ){
        if(parentheses.length() == max * 2){
            list.add(parentheses);
            return;
        }
        
        if(left < max){
            backtracking(list, parentheses + "(", left + 1, right, max);
        }
        
        if(right < left){
            backtracking(list, parentheses + ")", left, right + 1, max);
        }
    }
}