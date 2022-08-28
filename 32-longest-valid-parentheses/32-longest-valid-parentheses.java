class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        
        int max = 0;
        int count = 0;
        
        Stack<Integer> stack = new Stack<>();
        boolean[] check = new boolean[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else {
                if(!stack.isEmpty()){
                    check[i] = true;
                    check[stack.pop()] = true;
                }
            }
        }
        
        for(boolean flag : check){
            if(flag){
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        
        return Math.max(max, count);
    }
}